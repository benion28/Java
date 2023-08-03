/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package print.multiplication.table;

/**
 *
 * @author Beni-Fresh
 */
import java.util.Scanner;

public class PrintMultiplicationTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n, c;
        
        System.out.println("Enter an integer to print it's Multiplication Table");
        
        Scanner in = new Scanner (System.in);
        
        n = in.nextInt();
        
        System.out.println("Multiplication Table of "+n+" is :-");
        
        for ( c = 1; c <= 100; c++ )
            
            System.out.println(n+"*"+c+" = "+(n*c));
    }
}
