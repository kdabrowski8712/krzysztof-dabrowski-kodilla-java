package com.kodilla.patterns2.facade.api;

import com.kodilla.patterns2.facade.ShopService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Service;

import java.io.OptionalDataException;
import java.math.BigDecimal;


@Service
@EnableAspectJAutoProxy
public class OrderFacade {
    @Autowired
    private ShopService shopService;
    private static  Logger LOGGER = LoggerFactory.getLogger(OrderFacade.class);

    public void processOrder( OrderDto order,  Long userId)
    throws OrderProcessingException {
        boolean wasError = false;
        Long orderId = shopService.openOrder(userId);
        LOGGER.info("Registrating new order, ID: " + orderId);
        if (orderId <0) {
            LOGGER.error(OrderProcessingException.ERR_NOT_AUTHORISED);
            wasError=true;
            throw new OrderProcessingException(OrderProcessingException.ERR_NOT_AUTHORISED);
        }
        try {
            for(ItemDto orderItem : order.getItems()) {
                LOGGER.info("Adding item " + orderItem.getProductId() + ", "
                        + orderItem.getQuantity() + " pcs");
                shopService.addItem(orderId, orderItem.getProductId(), orderItem.getQuantity());
            }
            BigDecimal value = shopService.calculateValue(orderId);
            LOGGER.info("Value : " + value + " USD");
            if(!shopService.doPayment(orderId)) {
                LOGGER.error(OrderProcessingException.ERR_PAYMENT_REJECTED);
                wasError=true;
                throw new OrderProcessingException(OrderProcessingException.ERR_PAYMENT_REJECTED);
            }
            LOGGER.info("Payment for order was done");
            if(!shopService.verifyOrder(orderId)) {
                LOGGER.error(OrderProcessingException.ERR_VERIFICATION_ERR);
                wasError=true;
                throw new OrderProcessingException(OrderProcessingException.ERR_VERIFICATION_ERR);
            }
            LOGGER.info("Order is ready to be submitted");
            if(!shopService.submitOrder(orderId)) {
                LOGGER.error(OrderProcessingException.ERR_SUBMITTING_ERR);
                wasError=true;
                throw new OrderProcessingException(OrderProcessingException.ERR_SUBMITTING_ERR);
            }
            LOGGER.info("Order " + orderId + " submitted");
        }
        finally {
            if(wasError) {
                LOGGER.info("Canceling order " + orderId);
                shopService.cancelOrder(orderId);
            }
        }


    }


}