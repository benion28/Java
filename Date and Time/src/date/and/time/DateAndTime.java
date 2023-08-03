/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package date.and.time;

/**
 *
 * @author Beni-Fresh
 */
import java.util.*;

public class DateAndTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int day, month, year;
    int second, minute, hour;
    GregorianCalendar date = new GregorianCalendar();
    
    day = date.get(Calendar.DAY_OF_MONTH);
    month = date.get(Calendar.MONTH);
    year = date.get(Calendar.YEAR);
    
    second = date.get(Calendar.SECOND);
    minute = date.get(Calendar.MINUTE);
    hour = date.get(Calendar.HOUR);
    
    System.out.println("Benion Says The Current Date is "+day+"/"+(month+1)+"/"+year);
    System.out.println("And The Current Time is "+hour+" : "+minute+" : "+second);
    }
}
