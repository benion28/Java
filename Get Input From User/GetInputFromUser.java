/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package get.input.from.user;

/**
 *
 * @author Beni-Fresh
 */
import java.util.Scanner;

public class GetInputFromUser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        float b;
        String s;
        
        Scanner in = new Scanner (System.in);
        
        System.out.println("Benion Says Enter a string");
        
        s = in.nextLine();
        
        System.out.println("Benion Says You entered string "+s);
        
        System.out.println("Benion Says Enter an integer");
        
        a = in.nextInt();
        
        System.out.println("Benion Says You entered integer "+a);
        
        System.out.println("Benion Says Enter a float");
        
        b = in.nextFloat();
        
        System.out.println("Benion Says You entered float "+b);
    }
}
