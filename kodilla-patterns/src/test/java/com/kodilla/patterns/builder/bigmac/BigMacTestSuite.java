package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigMacTestSuite {

    @Test
    public void testNewBigMac() {
        //Given
        BigMac myBigMac = new BigMac.BigMacBuilder()
                .bun("WithSezame")
                .sauce(SauceType.BARBECUE)
                .ingaredient(BigMacIngaredient.CHEESE)
                .burgers(3)
                .ingaredient(BigMacIngaredient.CHILI)
                .ingaredient(BigMacIngaredient.ONION)
                .ingaredient(BigMacIngaredient.LETTUCE)
                .build();

        System.out.println(myBigMac);
        //When
        int howManyIngredients = myBigMac.getIngaredients().size();
        //Then
        Assert.assertEquals(4, howManyIngredients);
    }
}
