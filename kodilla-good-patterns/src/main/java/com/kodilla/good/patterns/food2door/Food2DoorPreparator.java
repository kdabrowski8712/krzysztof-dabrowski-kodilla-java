package com.kodilla.good.patterns.food2door;

public class Food2DoorPreparator {
    public static void prepareSuppliers(Food2DoorSuppliers input) {

        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        extraFoodShop.addProductToOffer(new Product("BioPotatoes","kg",100));

        input.addSupplier(extraFoodShop);
        input.addSupplier(new GlutenFreeShop());
        input.addSupplier(new HealthyShop());


    }
}
