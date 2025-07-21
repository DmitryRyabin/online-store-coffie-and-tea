package ru.store.online.model;

import ru.store.online.model.enums.*;

import java.math.BigDecimal;

public class Coffee extends Drink{

    private CoffeeType coffeeType;
    private Roasting roasting;
    private CoffeeVariety coffeeVariety;

    public Coffee(String name, BigDecimal price, double weight, Manufacturer manufacturer,
                  Countries countryOfOrigin, BoxingType boxing, CoffeeType coffeeType,
                  Roasting roasting, CoffeeVariety coffeeVariety) {
        super(name, price, weight, manufacturer, countryOfOrigin, boxing);
        this.coffeeType = coffeeType;
        this.roasting = roasting;
        this.coffeeVariety = coffeeVariety;
    }

    public CoffeeType getCoffeeType() {
        return coffeeType;
    }
    public Roasting getRoasting() {
        return roasting;
    }
    public CoffeeVariety getCoffeeVariety() {
        return coffeeVariety;
    }
}
