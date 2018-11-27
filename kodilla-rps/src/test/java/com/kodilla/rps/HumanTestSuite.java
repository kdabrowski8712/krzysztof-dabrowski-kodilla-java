package com.kodilla.rps;

import org.junit.Assert;
import org.junit.Test;

public class HumanTestSuite {


    @Test
    public void testAddWinInActualGame () {

        //Given
        Human testPlayer = new Human("testPlayer");
        testPlayer.setNumberOfWinsInActualGame(1);
        //When
        testPlayer.addWinInActualGame();


        //Then
        Assert.assertEquals(2,testPlayer.getNumberOfWinsInActualGame());

    }

    @Test
    public void testAddDraw() {

        //Given
        Human testPlayer = new Human("testPlayer");
        testPlayer.setNumberOfDrawsInActualGame(1);
        //When
        testPlayer.addDraw();


        //Then
        Assert.assertEquals(2,testPlayer.getNumberOfDrawsInActualGame());

    }

    @Test
    public void testAddWin() {
        //Given
        Human testPlayer = new Human("testPlayer");
        testPlayer.setOverallNumerOfWins(1);
        //When
        testPlayer.addWin();


        //Then
        Assert.assertEquals(2,testPlayer.getOverallNumerOfWins());
    }
}
