package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog() {

        //Given
        Logger.getInstance().log("test entry 1");

        //When
        String lastLog = Logger.getInstance().getLastLog();

        //Then
        Assert.assertEquals("test entry 1",lastLog);

    }


}
