/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package launch.notepad;

/**
 *
 * @author Beni-Fresh
 */
import java.util.*;

import java.io.*;

public class LaunchNotepad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Runtime rs = Runtime.getRuntime();
        
        try 
        {
            rs.exec("Notepad");
            
        }
        
        catch (IOException e) 
            
            System.out.println(e); 
    }
}
