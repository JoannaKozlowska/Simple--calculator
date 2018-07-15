package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DiscussionForumStatisticsTestSuite {
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
    public void testZeroPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(0);
        DiscussionForumStatistics newForum = new DiscussionForumStatistics(statisticsMock);
        //When
        newForum.calculateAdvStatistics();
        //Then
        Assert.assertEquals(0, newForum.getQuantityOfPosts());
    }

    @Test
    public void testManyPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(1000);
        DiscussionForumStatistics newForum = new DiscussionForumStatistics(statisticsMock);
        //When
        newForum.calculateAdvStatistics();
        //Then
        Assert.assertEquals(1000, newForum.getQuantityOfPosts());
    }

    @Test
    public void testZeroUsers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> theList1 = new ArrayList<>();
        DiscussionForumStatistics newForum = new DiscussionForumStatistics(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(theList1);
        //When
        newForum.calculateAdvStatistics();
        //Then
        Assert.assertEquals(0, newForum.getNumbersOfUsers());
    }

    @Test
    public void testZeroComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        DiscussionForumStatistics newForum = new DiscussionForumStatistics(statisticsMock);
        List<String> theList1 = new ArrayList<>();
        theList1.add("Jan Kowalsky");
        theList1.add("Joanna Kowalska");
        when(statisticsMock.usersNames()).thenReturn(theList1);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        newForum.calculateAdvStatistics();
        //Then
        Assert.assertEquals(2, newForum.getNumbersOfUsers());
        Assert.assertEquals(10, newForum.getQuantityOfPosts());
        Assert.assertEquals(5, newForum.getAveragePostsForUser(), 0.001);
        Assert.assertEquals(0, newForum.getAverageCommentsForUser(), 0.001);
    }

    @Test
    public void testManyUsers() {
        Statistics statisticsMock = mock(Statistics.class);
        DiscussionForumStatistics newForum = new DiscussionForumStatistics(statisticsMock);
        List<String> theList1 = new ArrayList<>();
        String name = "Asia Kozlowska";
        for (int n = 0; n < 100; n++) {
            theList1.add(name + " " + n);
        }
        when(statisticsMock.usersNames()).thenReturn(theList1);
        //When
        newForum.calculateAdvStatistics();
        //Then
        Assert.assertEquals(100, newForum.getNumbersOfUsers());
    }

    @Test
    public void moreCommentsThanPosts() {
        Statistics statisticsMock = mock(Statistics.class);
        DiscussionForumStatistics newForum = new DiscussionForumStatistics(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(20);
        //When
        newForum.calculateAdvStatistics();
        boolean result = newForum.getAverageCommentsforPost() > 1;
        //Then
        Assert.assertTrue(result);
    }

    @Test
    public void morePostsThanComments() {
        Statistics statisticsMock = mock(Statistics.class);
        DiscussionForumStatistics newForum = new DiscussionForumStatistics(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(20);
        when(statisticsMock.commentsCount()).thenReturn(10);
        //When
        newForum.calculateAdvStatistics();
        boolean result = newForum.getAverageCommentsforPost() < 1;
        //Then
        Assert.assertTrue(result);
    }
}
