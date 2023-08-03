package com.benionpackage;

/*
// Requesting to get Mobile Object Constructed
Mobile first_mobile = new Mobile();
// Product Object gets Constructed before the Mobile Object -- Rule to Inheritance (Object to Object)

// Write data to our Object
first_mobile.setProductDetails(301, "HP Laptop", 97_000);
first_mobile.showProductDetails();

System.out.println();

// Write data to our Object
Mobile second_mobile = new Mobile();
second_mobile.setProductDetails(308, "Sony Xperia", 65_000, "Andriod", 4, 64);
second_mobile.showProductDetails();
*/

public class Mobile extends Product {
    // IS-A Relation, Mobile IS-A Product, Mobile is Child and Product is Parent

    // Additional Attributes of Mobile other than Product
    String operatingSystem;
    int ram;
    int sdCardSize;

    // Constructor
    Mobile() {
        System.out.println(">>> Mobile Object Constructed <<<<");
    }

    // We have redefined the same method from the Parent into the Child with different inputs
    // We have two methods, one from the Parent and another of the Child
    // Both are different based on input (even though name is the same)
    // Method OVERLOADING: Same name with different inputs
    void setProductDetails(int product_id, String name, int price, String operatingSystem, int ram, int sdCardSize) {
        this.name = name;
        this.price = price;
        this.product_id = product_id;
        this.operatingSystem = operatingSystem;
        this.ram = ram;
        this.sdCardSize = sdCardSize;
        System.out.println(">>> Data Written in Mobile Object <<<<");
    }

    // Lets redefine showProductDetails() as well
    // But here we have same inputs
    // We have two methods, one from the Parent and another of the Child and we have same signatures
    // Child method will be executed and not the Parent
    // METHOD OVERRIDING: Same method name with same inputs in Parent Child Relation
    void showProductDetails() {
        System.out.println("-----Product ID:\t" + product_id + " -------");
        System.out.println("-----Name:\t" + name + " -------");
        System.out.println("-----Price:\t" + price + " -------");
        System.out.println("-----Operating System:\t" + operatingSystem + " -------");
        System.out.println("-----Ram:\t" + ram + " -------");
        System.out.println("-----SD Card Size:\t" + sdCardSize + " -------");
    }

}
