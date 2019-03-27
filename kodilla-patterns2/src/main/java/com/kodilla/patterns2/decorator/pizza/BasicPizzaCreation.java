package com.kodilla.patterns2.decorator.pizza;

public class BasicPizzaCreation implements PizzaCreation {


    @Override
    public double getPrice() {
        return 15.0;
    }

    @Override
    public String getIngredients() {
        return "base , souce , cheese ";
    }
}
