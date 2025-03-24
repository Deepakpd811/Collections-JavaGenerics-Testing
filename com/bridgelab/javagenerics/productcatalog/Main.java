package com.bridgelab.productcatalog;

public class Main {
    public static void main(String[] args) {
        // Creating category
        BookCategory book = new BookCategory("book");
        ClothingCategory cloth = new ClothingCategory("Clothing");

        // Creating Product
        Product<BookCategory> p1 = new Product<BookCategory>("java", "mid", 990, book);
        Product<BookCategory> p2 = new Product<BookCategory>("C++", "low", 290, book);

        Product<ClothingCategory> p3 = new Product<ClothingCategory>("Shirt", "low", 400, cloth);
        Product<ClothingCategory> p4 = new Product<ClothingCategory>("Trouser", "high", 900, cloth);

        // add product in catalog
        ProductCatalog pc = new ProductCatalog();
        pc.addProduct(p1);
        pc.addProduct(p2);
        pc.addProduct(p3);

        p3.applyDiscount(p4, 5);

        pc.addProduct(p4);

        pc.displayCatalog();


      

        

    }   
}
