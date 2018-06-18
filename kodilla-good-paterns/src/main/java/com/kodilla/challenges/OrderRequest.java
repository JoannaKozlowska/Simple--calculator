package com.kodilla.challenges;

import java.time.LocalDateTime;

public class OrderRequest {

    private User user;
    private LocalDateTime orderTime;
    private String nameOfProduct;
    private int quantityOfProduct;
    private double pricePerProduct;

    public OrderRequest(User user, LocalDateTime orderTime, String nameOfProduct, int quantityOfProduct,
                        double pricePerProduct) {
        this.user = user;
        this.orderTime = orderTime;
        this.nameOfProduct = nameOfProduct;
        this.quantityOfProduct = quantityOfProduct;
        this.pricePerProduct = pricePerProduct;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public int getQuantityOfProduct() {
        return quantityOfProduct;
    }

    public double getPricePerProduct() {
        return pricePerProduct;
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "user=" + user +
                ", orderTime=" + orderTime +
                ", nameOfProduct='" + nameOfProduct + '\'' +
                ", quantityOfProduct=" + quantityOfProduct +
                ", pricePerProduct=" + pricePerProduct +
                '}';
    }
}
