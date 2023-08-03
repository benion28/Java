package com.benionpackage;

// INHERITANCE
/*
Subclass s = new Subclass(24);
s.getAge();
*/

public class Superclass {
    int age;
    Superclass(int age){
        this.age = age;
    }
    public void getAge(){
        System.out.println("The value of the variable named age in super class is: " +age);
    }
}
