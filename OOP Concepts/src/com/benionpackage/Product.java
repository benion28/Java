package com.benionpackage;

/*
// Create an Object: Product
Product first_product = new Product();

// Write data in Object
first_product.setProductDetails(100, "Acer Laptop", 75_000);

// Reading data from our Object
first_product.showProductDetails();

System.out.println();

// Write data directly
Product second_product = new Product();
second_product.setProduct_id(201);
second_product.name = "Tecno Camon";
second_product.price = 55_000;
second_product.showProductDetails();
*/

public class Product {
    // Attributes(State)
    // private int product_id;
    int product_id;
    String name;
    int price;

    // Constuctor
    Product() {
        System.out.println(">>> Product Object Constructed <<<<");
    }

    // Methods(Behavior)
    // Write Data in Product Object
    void setProductDetails(int product_id, String name, int price) {
        this.name = name;
        this.price = price;
        this.product_id = product_id;
        System.out.println(">>> Data Written in Product Object <<<<");
    }

    // Display/Read Data of Product Object
    void showProductDetails() {
        System.out.println("-----Product ID:\t" + product_id + " -------");
        System.out.println("-----Name:\t" + name + " -------");
        System.out.println("-----Price:\t" + price + " -------");
    }

    // Set the product_id ---- (Setters)
    void setProduct_id(int product_id) {
        this.product_id = product_id; // This means reference to current Object
        // LHS belongs to the Object and RHS belongs to the Method
    }

    // Get the product_id ---- (Getters)
    int getProduct_id() {
        return product_id;
    }

}
