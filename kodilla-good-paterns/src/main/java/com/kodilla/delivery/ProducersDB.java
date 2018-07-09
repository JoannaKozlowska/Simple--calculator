package com.kodilla.delivery;

import java.util.HashSet;
import java.util.Set;

public class ProducersDB {
    public static Set<ProducerService> producers() {
        Set<ProducerService> listOfProducerServices = new HashSet();
        listOfProducerServices.add(new ExtraFoodShop());
        listOfProducerServices.add(new HealthyShop());
        listOfProducerServices.add(new GlutenFreeShop());
        return listOfProducerServices;
    }
}