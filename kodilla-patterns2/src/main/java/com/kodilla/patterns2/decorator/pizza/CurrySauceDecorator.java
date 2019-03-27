package com.kodilla.patterns2.decorator.pizza;

public class CurrySauceDecorator extends AbstractPizzaDecorator {
    public CurrySauceDecorator(PizzaCreation pizzaCreation) {
        super(pizzaCreation);
    }

    @Override
    public double getPrice() {
        return super.getPrice()+5.0;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients()+", curry sauce";
    }
}
