package com.kodilla.delivery;

import java.util.ArrayList;
import java.util.List;

public class ExtraFoodShop implements ProducerService {
    private List<String> listOfProducts = new ArrayList<>();

    public ExtraFoodShop() {
        listOfProducts.add("cabbage");
    }

    @Override
    public boolean process(DeliveryRequest deliveryRequest) {
        System.out.println("Welcome in ExtraFoodShop. Check if the product is available");
        if (listOfProducts.contains(deliveryRequest.getProductName())) {
            System.out.println(deliveryRequest.getProductName() + "  is available in shop");
            System.out.println(" Price is: " +
                    (deliveryRequest.getPricePerProduct() * deliveryRequest.getQuantityOfProduct()));
            return true;
        } else {
            System.out.println(deliveryRequest.getProductName() + " isn't available in the shop");
            return false;
        }
    }
}
