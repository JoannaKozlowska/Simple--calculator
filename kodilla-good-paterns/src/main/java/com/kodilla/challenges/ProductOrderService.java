package com.kodilla.challenges;

public class ProductOrderService {
    private InformationService informationService;
    private OrderRepository orderRepository;
    private OrderService orderService;

    public ProductOrderService(final InformationService informationService, final OrderRepository orderRepository,
                               final OrderService orderService) {
        this.informationService = informationService;
        this.orderRepository = orderRepository;
        this.orderService = orderService;
    }

    public OrderDTO process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest);
        if (isOrdered) {
            informationService.inform();
            orderRepository.createOrder();
            return new OrderDTO(orderRequest, true);
        } else {
            return new OrderDTO(orderRequest, false);
        }
    }
}