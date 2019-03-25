package com.kodilla.patterns2.facade;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Random;

@Service
public class ProductService {
    public BigDecimal getPrice(Long producrId) {
        BigDecimal price = BigDecimal.ONE;
        Random random = new Random();

        return new BigDecimal(random.nextInt(100000)/100);
    }
}
