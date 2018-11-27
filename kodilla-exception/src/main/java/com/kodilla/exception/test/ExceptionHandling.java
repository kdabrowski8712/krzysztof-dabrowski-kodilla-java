package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge challenge = new SecondChallenge();

        try
        {
            String result = challenge.probablyIWillThrowException(2, 1.5);
        }catch(Exception e) {
            System.out.println("Excepton caught" );
        }
        finally {
            System.out.println("After block");
        }
    }
}
