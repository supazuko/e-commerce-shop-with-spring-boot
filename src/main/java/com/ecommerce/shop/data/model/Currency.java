package com.ecommerce.shop.data.model;

public enum Currency {
    NGN("Naira"),
    USD("US Dollar"),
    GBP("Pounds"),
    GHC("Cedis"),
    CAD("Canadian Dollars"),
    CFA("Francs");

    private String name;

    Currency(String currency) {
        this.name = currency;
    }

    private String getName(){
        return this.name;
    }
}
