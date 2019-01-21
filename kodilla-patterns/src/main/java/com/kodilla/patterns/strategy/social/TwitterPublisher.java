package com.kodilla.patterns.strategy.social;

public class TwitterPublisher implements SocialPublisher {
    @Override
    public String share(String postBody) {
        return "Twitter: " + postBody;
    }
}
