package com.kodilla.challenges;

public class SMSNotifier implements InformationService {
    @Override
    public String inform() {
        System.out.println("SMS notification");
        return "SMS has been sent";
    }
}
