package com.benionpackage;

// INHERITANCE
/*
int a = 20, b = 10;
My_Calculation demo = new My_Calculation();
demo.addition(a, b);
demo.subtraction(a, b);
demo.multiplication(a, b);
*/

public class Calculation {
    int z;
    public void addition(int x, int y){
        z = x+y;
        System.out.println("The sum of the given numbers:"+z);
    }
    public void subtraction(int x, int y){
        z = x-y;
        System.out.println("The difference between the given numbers:"+z);
    }
}
