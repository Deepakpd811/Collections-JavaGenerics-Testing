package com.bridgelab.warehouse;

abstract class WarehouseItem {
    private String name;
    private double price;

    //Constructor
    WarehouseItem(String name, double price){
        this.name = name;
        this.price = price;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " - $" + price;
    }

    

}
