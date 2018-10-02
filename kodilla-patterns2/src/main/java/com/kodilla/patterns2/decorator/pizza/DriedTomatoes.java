package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class DriedTomatoes extends AbstractPizzaOrderDecorator {
    public DriedTomatoes(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + dried tomatoes";
    }
}
