package com.benionpackage;

// OVER-RIDDING
/*
Bird a = new Dove(); // Bird reference but Dove object
a.move(); //Runs the method in Dove class
Dove b = new Dove(); // Dove reference and object
b.fly();
*/

public class Bird {
    public void move(){
        System.out.println("Birds can move");
    }
}
