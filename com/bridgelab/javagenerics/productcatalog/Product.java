package com.bridgelab.productcatalog;

// Generic product class 
public class Product<T extends Category> {
    private String name ;
    private String pricerange;
    private T category;
    public double price;

    // constructor
    Product(String name, String pricerange,double price, T category){
        this.name = name;
        this.pricerange = pricerange;
        this.category = category;
        this.price = price;
    }    

    // apply discount on product
    public  void applyDiscount(Product<?> product, double percentage){
        double discountAmount =(product.price * percentage) / 100;
        product.price -= discountAmount;
        System.out.println("Amount after " + percentage +" discount on " + product.name +" is " + product.price);
    }

    @Override
    public String toString() {
        return name + " [" + category.getName() + "] - Price: " + price;
    }

}
