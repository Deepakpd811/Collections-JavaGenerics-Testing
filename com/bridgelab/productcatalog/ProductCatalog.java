package com.bridgelab.productcatalog;

import java.util.ArrayList;
import java.util.List;


// ProductCatalog class
public class ProductCatalog {

    // list of Product of any type 
    private List<Product<?>>  listofproducts = new ArrayList<>();

    public void addProduct(Product<?> product){
        listofproducts.add(product);
    }

    // Display the product in a catalog
    public void displayCatalog(){
        for(Product x: listofproducts){
            System.out.println(x);
        }
    }

}

