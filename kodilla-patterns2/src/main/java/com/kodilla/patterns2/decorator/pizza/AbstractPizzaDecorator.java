package com.kodilla.patterns2.decorator.pizza;

public class AbstractPizzaDecorator implements PizzaCreation {


    private final PizzaCreation pizzaCreation;

    protected AbstractPizzaDecorator(PizzaCreation pizzaCreation) {
        this.pizzaCreation = pizzaCreation;
    }


    @Override
    public double getPrice() {
        return pizzaCreation.getPrice();
    }

    @Override
    public String getIngredients() {
        return pizzaCreation.getIngredients();
    }
}
