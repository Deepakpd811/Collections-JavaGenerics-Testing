package com.bridgelab.warehouse;

import java.util.ArrayList;
import java.util.List;

public class Storage<T extends WarehouseItem> {  // Bounded type parameter

    private List<T> listOfItem = new ArrayList<>();

    public void addItem(T item) {
        listOfItem.add(item);
    }

    public List<T> getItems() {
        return listOfItem;
    }

    public void displayAll(List<? extends WarehouseItem> items) { // wildcard 
        for (WarehouseItem item : listOfItem) {
            System.out.println(item);
        }

    }

}
