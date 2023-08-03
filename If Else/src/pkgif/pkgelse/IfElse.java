/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkgelse;

/**
 *
 * @author Beni-Fresh
 */
import java.util.Scanner ;  

public class IfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int marksObtained, passingMarks ;
        
        passingMarks = 40;
        
        Scanner input = new  Scanner(System.in) ;
        
        System.out.println("Input marks scored by you");
        
        marksObtained = input.nextInt ();
        
        if (marksObtained >= passingMarks) 
     {
        
        System.out.println("You passed the exam.");
    }
     else 
    {
        System.out.println("Unfortunately you failedto pass the exam.");
    }
    }
}
