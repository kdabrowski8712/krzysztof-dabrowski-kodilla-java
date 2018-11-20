package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testgetPeopleQuantityOneContinent() {
        //Given
        World myWorld = new World();

        Continent europe = new Continent("Europe");
        europe.addCountry(new BigDecimal("5000000"),"Poland");
        europe.addCountry(new BigDecimal("7000000"),"Germant");
        europe.addCountry(new BigDecimal("4000000"),"Slovakia");

        myWorld.addContinent(europe);

        //When
        BigDecimal result = myWorld.getPeopleQuantity();
        BigDecimal expectedResult = new BigDecimal("16000000");
        //Then
        Assert.assertEquals(expectedResult,result);
    }

    @Test
    public void testgetPeopleQuantityCoupleOfContinen() {

        //Given
        World myWorld = new World();

        Continent europe = new Continent("Europe");
        europe.addCountry(new BigDecimal("5000000"),"Poland");
        europe.addCountry(new BigDecimal("7000000"),"Germant");
        europe.addCountry(new BigDecimal("4000000"),"Slovakia");

        Continent asia = new Continent("Asia");
        asia.addCountry(new BigDecimal("14000000"),"Russia");

        Continent northAmerica = new Continent("North America");
        northAmerica.addCountry(new BigDecimal("15000000"),"USA");

        myWorld.addContinent(europe);
        myWorld.addContinent(asia);
        myWorld.addContinent(northAmerica);

        //When
        BigDecimal result = myWorld.getPeopleQuantity();
        BigDecimal expectedResult = new BigDecimal("45000000");
        //Then
        Assert.assertEquals(expectedResult,result);
    }

    @Test
    public void testgetPeopleQuantityEmptyContinent() {
        World myWorld = new World();
        Continent emptyOne = new Continent("Empty");

        myWorld.addContinent(emptyOne);

        //When
        BigDecimal result = myWorld.getPeopleQuantity();
        BigDecimal expectedResult = BigDecimal.ZERO;
        //Then
        Assert.assertEquals(expectedResult,result);

    }
}
