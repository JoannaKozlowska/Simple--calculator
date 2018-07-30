package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User joanna = new Millenials("Joanna Kozlowska");
        User edyta = new YGeneration("Edyta Dudzinska");
        User tomek = new ZGeneration("Tomasz Woźniak");
        //When
        String joannaShouldChoose = joanna.sharePost();
        System.out.println("Joanna should choose: " + joannaShouldChoose);
        String edytaShouldChoose = edyta.sharePost();
        System.out.println("Edyta should choose: " + edytaShouldChoose);
        String tomekShouldChoose = tomek.sharePost();
        System.out.println("Tomek should choose: " + tomekShouldChoose);
        //Then
        Assert.assertEquals("Facebook", joannaShouldChoose);
        Assert.assertEquals("Snapchat", edytaShouldChoose);
        Assert.assertEquals("Twitter", tomekShouldChoose);
    }
    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User joanna = new Millenials("Joanna Kozlowska");
        //When
        String joannaShouldChoose = joanna.sharePost();
        System.out.println();
        System.out.println("Joanna should choose: " + joannaShouldChoose);
        joanna.setSocialPublisherStrategy(new SnapchatPublisher());
        joannaShouldChoose = joanna.sharePost();
        System.out.println("Changing strategy");
        System.out.println("Joanna now should choose: " + joannaShouldChoose);
        //Then
        Assert.assertEquals("Snapchat", joannaShouldChoose);
    }
}
