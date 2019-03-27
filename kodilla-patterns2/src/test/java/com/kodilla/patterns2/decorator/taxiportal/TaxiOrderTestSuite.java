package com.kodilla.patterns2.decorator.taxiportal;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.context.TestExecutionListeners;

import java.math.BigDecimal;

public class TaxiOrderTestSuite {

    @Test
    public void testBasicTaxiOrderGetCost() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();

        //When
        BigDecimal calcuatedCost = theOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(5),calcuatedCost);
    }

    @Test
    public void testBasicTaxiOrderGetDescription() {
        //Given
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();

        //When
        String desc = theOrder.getDescription();

        //Then
        Assert.assertEquals("Drive a course",desc);
    }

    @Test
    public void testTaxNetworkiOrderGetCost() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder= new TaxiNetworkOrderDecorator(theOrder);

        //When
        BigDecimal calcuatedCost = theOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(40),calcuatedCost);
    }

    @Test
    public void testTaxiNey4tworkOrderGetDescription() {
        //Given
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder= new TaxiNetworkOrderDecorator(theOrder);
        //When
        String desc = theOrder.getDescription();

        //Then
        Assert.assertEquals("Drive a course by Taxi Network",desc);
    }

    @Test
    public void testMyTaxiWithChildSeatsCost() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder= new MyTaxiNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);

        //When
        BigDecimal calcuatedCost = theOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(37),calcuatedCost);
    }

    @Test
    public void testMyTaxiWithChildSeatDesc() {

        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder= new MyTaxiNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);

        //When
        String desc = theOrder.getDescription();

        //Then
        Assert.assertEquals("Drive a course by MyTaxi Network + child seat",desc);



    }

    @Test
    public void testUberWithTwoChildSeatCost() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder= new MyTaxiNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);

        //When
        BigDecimal calcuatedCost = theOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(39),calcuatedCost);

    }

    @Test
    public void testUberWithTwoChildSeatDesc() {

        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder= new MyTaxiNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);

        //When
        String desc = theOrder.getDescription();

        //Then
        Assert.assertEquals("Drive a course by MyTaxi Network + child seat + child seat",desc);


    }
}
