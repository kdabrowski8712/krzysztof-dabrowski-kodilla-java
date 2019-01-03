package com.kodilla.good.patterns.challenges;

public class User {
    private String name;
    private String surname;
    private String login;
    private  boolean isBlockedInSystem;

    public User(String name, String surname, String login, boolean isLocked) {
        this.name = name;
        this.surname = surname;
        this.login = login;
        this.isBlockedInSystem = isLocked;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getLogin() {
        return login;
    }

    public boolean isBlockedInSystem() {
        return isBlockedInSystem;
    }

    public void setBlockedInSystem(boolean blockedInSystem) {
        isBlockedInSystem = blockedInSystem;
    }
}
