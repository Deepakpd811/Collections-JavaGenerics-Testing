package com.bridgelab.productcatalog;


//// category abstract class
abstract class Category {
    String name;

    Category(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
   
    @Override
    public String toString() {
       
        return name;
    }
}







