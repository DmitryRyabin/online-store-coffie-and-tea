package ru.store.online.model;

import ru.store.online.model.enums.*;

import java.math.BigDecimal;

public class Tea extends Drink{

    private Flavoring flavoring;
    private TeaType teaType;

    public Tea(String name, BigDecimal price, double weight, Manufacturer manufacturer,
               Countries countryOfOrigin, BoxingType boxing, Flavoring flavoring,
               TeaType teaType) {
        super(name, price, weight, manufacturer, countryOfOrigin, boxing);
        this.flavoring = flavoring;
        this.teaType = teaType;
    }

    public Flavoring getFlavoring() {
        return flavoring;
    }
    public TeaType getTeaType() {
        return teaType;
    }
}
