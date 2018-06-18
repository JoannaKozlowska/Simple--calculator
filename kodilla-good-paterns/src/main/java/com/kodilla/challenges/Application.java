package com.kodilla.challenges;

public class Application {
    public static void main(String[] args) {
        InformationService informationService = new SMSNotifier();
        OrderRepository orderRepository = new OrderDB();
        OrderService orderService = new MyWWWShop();
        OrderRequest orderRequest = OrderRequestRetriver.retrieve();
        ProductOrderService productOrderService = new ProductOrderService(informationService,
                orderRepository, orderService);
        productOrderService.process(orderRequest);
    }
}
