package com.kodilla.delivery;

public class Food2Door {
    public static void main(String[] args) {
        DeliveryRequest deliveryRequest = new DeliveryRequest("Warszawa, Mokra", "carrot",
                10, 4.5);
        ProductDeliveryService productDeliveryService = new ProductDeliveryService();
        productDeliveryService.findProducer(deliveryRequest);
    }
}
