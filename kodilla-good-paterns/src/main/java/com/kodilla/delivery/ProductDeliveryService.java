package com.kodilla.delivery;

public class ProductDeliveryService {

    public boolean findProducer(DeliveryRequest deliveryRequest) {
        ProducerService producerService = null;
        for (ProducerService theProducer: ProducersDB.producers()){
            if(theProducer.process(deliveryRequest)){
                producerService = theProducer;
            }
        }
        if (producerService == null){
            System.out.println("Producer is not available");
            return false;
        } else {
            System.out.println("Producer is found. Order is processed");
            return true;
        }
    }
}