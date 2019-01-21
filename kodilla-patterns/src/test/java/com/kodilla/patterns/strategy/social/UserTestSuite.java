package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {

        //Given
        Millenials millenialsUser = new Millenials("jkowalski");
        ZGeneration zGenerationUser = new ZGeneration("abialy");
        YGeneration yGenerationUser = new YGeneration("zg11245");

        //When
        String sharedPostMillenial = millenialsUser.sharePost("post1");
        String sharedPostzGen = zGenerationUser.sharePost("post2");
        String sharedPostyGen = yGenerationUser.sharePost("post3");

        //Then
        Assert.assertEquals("FaceBook: post1",sharedPostMillenial);
        Assert.assertEquals("Snapchat: post2",sharedPostzGen);
        Assert.assertEquals("Twitter: post3",sharedPostyGen);

    }

    @Test
    public void testIndividualSharingStrategy() {

        //Given
        Millenials millenialsUser = new Millenials("jkowalski");

        //When
        String sharedPostMillenialDefault = millenialsUser.sharePost("post1");
        millenialsUser.setSocialPublisher(new SnapchatPublisher());
        String sharedPostMillenialChanged = millenialsUser.sharePost("post2");

        //Then
        Assert.assertEquals("FaceBook: post1",sharedPostMillenialDefault);
        Assert.assertEquals("Snapchat: post2",sharedPostMillenialChanged);


    }
}
