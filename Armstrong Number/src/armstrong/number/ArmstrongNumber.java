/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package armstrong.number;

/**
 *
 * @author Beni-Fresh
 */
import java.util.*;

public class ArmstrongNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int n, sum = 0, temp, r;
    
    Scanner in = new Scanner(System.in);
    System.out.println("Benion Says Enter a number to check if it is an srmstrong number");
    n = in.nextInt();
    
    temp = n;
    
    while( temp != 0 )
    {
        r = temp;
        sum = sum + r*r*r;
        temp = temp/10;
    }
    if ( n == sum )
        System.out.println("Benion Says Entered Number is an Armstrong Number.");
    else
        System.out.println("Benion Says Entered Number is not an Armstrong Number.");
    }
}
