package com.benionpackage;

public class Main {

    public static void main(String args[]){
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

    }
}
