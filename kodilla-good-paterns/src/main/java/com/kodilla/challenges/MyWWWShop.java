package com.kodilla.challenges;

import java.util.Random;

public class MyWWWShop implements OrderService {
    @Override
    public boolean order(OrderRequest orderRequest) {
        Random random = new Random();
        boolean result = random.nextBoolean();
        System.out.println("Processing order: " + orderRequest);
        System.out.println("Processing result: " + result);
        return result;
    }
}
