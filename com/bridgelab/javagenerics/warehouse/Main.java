package com.bridgelab.warehouse;

public class Main {

    public static void main(String[] args) {
        Storage<Furniture> storageFurniture = new Storage<>();
        Storage<Groceries> storageGroceries = new Storage<>();
        Storage<Electronics> storageElectronics = new Storage<>();



        // Storage<String> ss = new Storage<>(); // give an error as we retrict to warehouse item only

        // Add item to to the electronic storage
        storageElectronics.addItem(new Electronics("Tv", 20000));
        storageElectronics.addItem(new Electronics("Mobile", 25000));

        // storageElectronics.add(new Fu)

        // Add item to to the Furniture storage
        storageFurniture.addItem(new Furniture("Table", 2555));

        // Add item to to the Groceries storage
        storageGroceries.addItem(new Groceries("Rice", 60));

        System.out.println("Electronic Storage");
        storageElectronics.displayAll(storageElectronics.getItems());

        System.out.println("Furniture Storage");
        storageFurniture.displayAll(storageFurniture.getItems());

        System.out.println("Groceries Storage");
        storageFurniture.displayAll(storageElectronics.getItems());

        

    }
}
