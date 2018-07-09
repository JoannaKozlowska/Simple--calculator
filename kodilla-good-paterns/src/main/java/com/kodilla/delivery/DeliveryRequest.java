package com.kodilla.delivery;

public class DeliveryRequest {
    private String deliveryAddress;
    private String productName;
    private int quantityOfProduct;
    private double pricePerProduct;

    public DeliveryRequest(String deliveryAddress, String productName, int quantityOfProduct, double pricePerProduct) {
        this.deliveryAddress = deliveryAddress;
        this.productName = productName;
        this.quantityOfProduct = quantityOfProduct;
        this.pricePerProduct = pricePerProduct;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantityOfProduct() {
        return quantityOfProduct;
    }

    public double getPricePerProduct() {
        return pricePerProduct;
    }

    @Override
    public String toString() {
        return "DeliveryRequest{" +
                "deliveryAddress='" + deliveryAddress + '\'' +
                ", productName='" + productName + '\'' +
                ", quantityOfProduct=" + quantityOfProduct +
                ", pricePerProduct=" + pricePerProduct +
                '}';
    }
}
