package com.kodilla.challenges;

public class OrderDB implements OrderRepository {
    @Override
    public void createOrder() {
        System.out.println("Order has been saved");
    }
}
