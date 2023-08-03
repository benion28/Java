package com.benionpackage;

public class Dove extends Bird {
    public void move(){
        super.move(); // invokes the super class method
        System.out.println("Doves can walk");
    }
    public void fly(){
        System.out.println("Doves can fly");
    }
}
