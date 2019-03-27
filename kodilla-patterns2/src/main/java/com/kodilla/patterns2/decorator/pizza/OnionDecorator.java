package com.kodilla.patterns2.decorator.pizza;

public class OnionDecorator extends AbstractPizzaDecorator {
    public OnionDecorator(PizzaCreation pizzaCreation) {
        super(pizzaCreation);
    }

    @Override
    public double getPrice() {
        return super.getPrice()+2.50;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients()+ ", onion";
    }
}
