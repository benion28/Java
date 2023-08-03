/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package show.ip.address;

/**
 *
 * @author Beni-Fresh
 */
import java.net.InetAddress;

public class ShowIPAddress {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
        // TODO code application logic here
        throws Exception 
                {
                    System.out.println(InetAddress.getLocalHost());
                }
    
}
