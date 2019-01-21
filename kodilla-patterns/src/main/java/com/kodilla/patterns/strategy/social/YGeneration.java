package com.kodilla.patterns.strategy.social;

public class YGeneration extends User {
    public YGeneration(String username) {
        super("YGeneration ( " + username  +" )");
        this.socialPublisher = new TwitterPublisher();
    }
}
