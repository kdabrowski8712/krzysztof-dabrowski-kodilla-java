package com.kodilla.good.patterns.challenges;

public class MailInformationService implements InformationService {

    @Override
    public void inform(User user, double amount) {

        System.out.println("Sending mail to " + user.getName() + "to pay " + amount);

    }
}
