package com.kodilla.testing.forum.statistics;

import org.junit.*;


import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsCalculatorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testCalculateAdvStatisticWhenNoUsersPostsComments() {
        System.out.println("Test - user number is 0 , post number is 0 , comment number is 0");

        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(new ArrayList<String>());

        ForumStatiscticsCalculator myCalculator = new ForumStatiscticsCalculator();
        myCalculator.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(0,myCalculator.getCommentCount());
        Assert.assertEquals(0,myCalculator.getPostCount());
        Assert.assertEquals(0,myCalculator.getUserCount());
        Assert.assertEquals(0,myCalculator.getAverageCommentCountPerPost(),0.001);
        Assert.assertEquals(0,myCalculator.getAverageCommentCountPerUser(),0.001);
        Assert.assertEquals(0,myCalculator.getAveragePostCountPerUser(),0.001);
    }

    @Test
    public void testCalculateAdvStatisticWhenNoComments() {

        System.out.println("Test - user number is 100 , post number is 1000 , comment number is 0");

        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(1000);

        List<String> userReplay = new ArrayList<String>();

        for(int i=0; i<100; i++) {
            userReplay.add("User" + (i+1));
        }

        System.out.println(userReplay.size());

        when(statisticsMock.usersNames()).thenReturn(userReplay);

        ForumStatiscticsCalculator myCalculator = new ForumStatiscticsCalculator();
        myCalculator.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(0,myCalculator.getCommentCount());
        Assert.assertEquals(1000,myCalculator.getPostCount());
        Assert.assertEquals(100,myCalculator.getUserCount());
        Assert.assertEquals(0,myCalculator.getAverageCommentCountPerPost(),0.001);
        Assert.assertEquals(0,myCalculator.getAverageCommentCountPerUser(),0.001);
        Assert.assertEquals(10.0,myCalculator.getAveragePostCountPerUser(),0.001);
    }

    @Test
    public void testCalculateAdvStatisticWhenCommQuantityLessThanPostQuantity() {
        System.out.println("Test - user number is 100 , post number is 1000 , comment number is 500");

        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.commentsCount()).thenReturn(500);
        when(statisticsMock.postsCount()).thenReturn(1000);

        List<String> userReplay = new ArrayList<String>();

        for(int i=0; i<100; i++) {
            userReplay.add("User" + (i+1));
        }

        when(statisticsMock.usersNames()).thenReturn(userReplay);

        ForumStatiscticsCalculator myCalculator = new ForumStatiscticsCalculator();
        myCalculator.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(500,myCalculator.getCommentCount());
        Assert.assertEquals(1000,myCalculator.getPostCount());
        Assert.assertEquals(100,myCalculator.getUserCount());
        Assert.assertEquals(0.5,myCalculator.getAverageCommentCountPerPost(),0.001);
        Assert.assertEquals(5.0,myCalculator.getAverageCommentCountPerUser(),0.001);
        Assert.assertEquals(10.0,myCalculator.getAveragePostCountPerUser(),0.001);
    }

    @Test
    public void testCalculateAdvStatisticWhenCommQuantityGreaterThanPostQuantity() {

        System.out.println("Test - user number is 100 , post number is 1000 , comment number is 1500");

        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.commentsCount()).thenReturn(1500);
        when(statisticsMock.postsCount()).thenReturn(1000);

        List<String> userReplay = new ArrayList<String>();

        for(int i=0; i<100; i++) {
            userReplay.add("User" + (i+1));
        }

        when(statisticsMock.usersNames()).thenReturn(userReplay);

        ForumStatiscticsCalculator myCalculator = new ForumStatiscticsCalculator();
        myCalculator.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(1500,myCalculator.getCommentCount());
        Assert.assertEquals(1000,myCalculator.getPostCount());
        Assert.assertEquals(100,myCalculator.getUserCount());
        Assert.assertEquals(1.5,myCalculator.getAverageCommentCountPerPost(),0.001);
        Assert.assertEquals(15.0,myCalculator.getAverageCommentCountPerUser(),0.001);
        Assert.assertEquals(10.0,myCalculator.getAveragePostCountPerUser(),0.001);
    }

}
