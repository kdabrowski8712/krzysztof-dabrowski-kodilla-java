package com.kodilla.patterns2.decorator.pizza;

import com.kodilla.patterns2.decorator.taxiportal.BasicTaxiOrder;
import com.kodilla.patterns2.decorator.taxiportal.ChildSeatDecorator;
import com.kodilla.patterns2.decorator.taxiportal.MyTaxiNetworkOrderDecorator;
import com.kodilla.patterns2.decorator.taxiportal.TaxiOrder;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaCreationTestSuite {

    @Test
    public void testOnionPizzaCreation() {
        //Given
        //Given
        PizzaCreation pizzaCreation = new BasicPizzaCreation();
        pizzaCreation = new OnionDecorator(pizzaCreation);

        //When
        double cost = pizzaCreation.getPrice();
        String desc = pizzaCreation.getIngredients();
        //Then
        Assert.assertEquals(17.50,cost,0.00001);
        Assert.assertEquals("base , souce , cheese , onion",desc);
        //When

        //Then
    }

    @Test
    public void testOnionAndMashroomDecorator() {

        //Given
        PizzaCreation pizzaCreation = new BasicPizzaCreation();
        pizzaCreation = new OnionDecorator(pizzaCreation);
        pizzaCreation = new MashroomDecorator(pizzaCreation);

        //When
        double cost = pizzaCreation.getPrice();
        String desc = pizzaCreation.getIngredients();
        //Then
        Assert.assertEquals(20.50,cost,0.00001);
        Assert.assertEquals("base , souce , cheese , onion, mashrroms",desc);
        //When

    }
}
