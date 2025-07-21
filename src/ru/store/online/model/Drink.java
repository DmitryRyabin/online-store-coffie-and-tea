package ru.store.online.model;

import ru.store.online.model.enums.BoxingType;
import ru.store.online.model.enums.Countries;
import ru.store.online.model.enums.Manufacturer;

import java.math.BigDecimal;

public abstract class Drink {

    public Drink(String name, BigDecimal price, double weight, Manufacturer manufacturer, Countries countryOfOrigin, BoxingType boxing) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.boxing = boxing;
    }

    private String name;
    private BigDecimal price;
    private double weight;
    private Manufacturer manufacturer;
    private Countries countryOfOrigin;
    private BoxingType boxing;

    public String getName() {
        return name;
    }
    public BigDecimal getPrice() {
        return price;
    }
    public double getWeight() {
        return weight;
    }
    public Manufacturer getManufacturer() {
        return manufacturer;
    }
    public Countries getCountryOfOrigin() {
        return countryOfOrigin;
    }
    public BoxingType getBoxing() {
        return boxing;
    }
}
