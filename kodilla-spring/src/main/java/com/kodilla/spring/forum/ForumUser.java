package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class ForumUser {
    private String username;

    public ForumUser() {
        username="John Smith";
    }

    public String getUsername() {
        return username;
    }
}
