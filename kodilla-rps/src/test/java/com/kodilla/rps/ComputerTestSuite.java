package com.kodilla.rps;

import org.junit.Assert;
import org.junit.Test;

public class ComputerTestSuite {
    @org.junit.Test
    public void testAddWinInActualGame () {

        //Given
        Computer testPlayer = new Computer();
        testPlayer.setNumberOfWinsInActualGame(1);
        //When
        testPlayer.addWinInActualGame();


        //Then
        Assert.assertEquals(2,testPlayer.getNumberOfWinsInActualGame());

    }

    @org.junit.Test
    public void testAddDraw() {

        //Given
        Computer testPlayer = new Computer();
        testPlayer.setNumberOfDrawsInActualGame(1);
        //When
        testPlayer.addDraw();


        //Then
        Assert.assertEquals(2,testPlayer.getNumberOfDrawsInActualGame());

    }

    @Test
    public void testAddWin() {
        //Given
        Computer testPlayer = new Computer();
        testPlayer.setOverallNumerOfWins(1);
        //When
        testPlayer.addWin();


        //Then
        Assert.assertEquals(2,testPlayer.getOverallNumerOfWins());
    }
}
