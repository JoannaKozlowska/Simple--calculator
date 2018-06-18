package com.kodilla.challenges;

public class OrderDTO {
    public OrderRequest orderRequest;
    public boolean isOrdered;

    public OrderDTO(final OrderRequest orderRequest, final boolean isOrdered) {
        this.orderRequest = orderRequest;
        this.isOrdered = isOrdered;
    }

    public OrderRequest getOrderRequest() {
        return orderRequest;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
