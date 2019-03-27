package com.kodilla.patterns2.decorator.pizza;

public class MashroomDecorator extends  AbstractPizzaDecorator {
    public MashroomDecorator(PizzaCreation pizzaCreation) {
        super(pizzaCreation);
    }

    @Override
    public double getPrice() {
        return super.getPrice()+3.0;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients()+ ", mashrroms";
    }
}
