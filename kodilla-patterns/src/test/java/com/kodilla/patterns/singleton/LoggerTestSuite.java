package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testGetLog() {
        //Given & When
        Logger.getInstance().log("JKozlowska");
        String newLog1 = Logger.getInstance().getLastLog();
        Logger.getInstance().log("EWozniak");
        String newLog2 = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("JKozlowska", newLog1);
        Assert.assertEquals("EWozniak", newLog2);

    }
}
