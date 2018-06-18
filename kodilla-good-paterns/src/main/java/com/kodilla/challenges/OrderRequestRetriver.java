package com.kodilla.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriver {
    public static OrderRequest retrieve() {
        return new OrderRequest(new User("Joanna"), LocalDateTime.now(), "Book",
                1, 25.5);
    }
}