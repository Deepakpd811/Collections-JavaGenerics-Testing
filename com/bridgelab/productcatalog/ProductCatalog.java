package com.bridgelab.productcatalog;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalog {

    private List<Product<?>>  listofproducts = new ArrayList<>();

    public void addProduct(Product<?> product){
        listofproducts.add(product);
    }

    public void displayCatalog(){
        for(Product x: listofproducts){
            System.out.println(x);
        }
    }

    

}

