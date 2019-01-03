package com.kodilla.good.patterns.challenges;

public class ProductOrderProcessor {
    private DeliveryMethod deliveryMethod;
    private PaymentMethod paymentMethod;
    private OrderService orderService;
    private  InformationService infoService;
    private  OrderRepository orderRepository;

    public ProductOrderProcessor(final DeliveryMethod deliveryMethod, final PaymentMethod paymentMethod,
                                 final OrderService orderService, final InformationService infoService,
                                 final OrderRepository orderRepository) {

        this.deliveryMethod = deliveryMethod;
        this.paymentMethod = paymentMethod;
        this.orderService = orderService;
        this.infoService = infoService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final Order order) {

        boolean canBeOrdered = orderService.order(order.getOrderOwner(),order.getOrderedItem(),order.getQuantity());

        if (canBeOrdered) {

            double amountToPay = order.calculateAmountOfMoneyToPay(deliveryMethod);
            paymentMethod.processPayment(order.getOrderOwner(),amountToPay);
            infoService.inform(order.getOrderOwner(),amountToPay);
            orderRepository.storeOrder(order);
            return new OrderDto(order,true);
        }


        return new OrderDto(order,false);
    }
}
