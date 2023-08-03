/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simple.atm.machine;

/**
 *
 * @author Beni-Fresh
 */
import java.util.Scanner;

public class SimpleATMMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner (System.in);
        
        int amount
                =0;
        int choice
                =0;
        int[]
                
       transactions = new int[10];
        
        int sum;
        int balance
                =0;
        
        while (choice != 4)
        {
            choice = menu();
            
            switch (choice)
            {
                case 1:
                    System.out.println("Benion Says Enter Amount to Deposit? :");
                    
                    sum = keyboard.nextInt();
                    
                    if (sum == 0)
                    {
                        System.out.println("Benion Says Wrong amount. ");
                        System.out.println();
                        System.out.println();
                    }
                    else
                    {
                        amount = (int) + sum;
                        makeTransactions (amount, transactions);
                    }
                    break;
                case 2:
                        System.out.println("Benion Says How Much do you want to Withdraw?: ");
                        sum = keyboard.nextInt();
                        if(sum == 0)
                        {
                            System.out.println("Benion Says Wrong Amount");
                            System.out.println();
                            System.out.println();
                        }
                        else
                        {
                            amount = (int) - sum;
                            makeTransactions (amount, transactions);
                        }
                        break;
                case 3:
                    showTransactions (transactions, balance);
                    break;
                case 4:
                    System.out.println("Benion Says You Chosed to End ");
                    break;
            }
        }
                                
    }
     
     public static int menu()
     {
         Scanner keyboard = new Scanner (System.in);
         int choice = 0;
         
         System.out.println("Benion Simple ATM");
         System.out.println();
         System.out.println("1. Benion Says Deposit ");
         System.out.println("2. Benion Says Withdraw ");
         System.out.println("3. Benion Says Transactions ");
         System.out.println("4. Benion Says End ");
         System.out.println();
         System.out.println("Benion Says Your Choice");
         
         choice = keyboard.nextInt();
         return choice;
     }
     
     public static void showTransactions
             (int [] transactions, int balance)
     {
         System.out.println();
         System.out.println(  "Benion Says Last transaction");
         System.out.println();
         
         for (int i = 0; i < transactions.length- 1; i++)
         {
             if(transactions[i] == 0)
             {
                 System.out.println("");
             }
             else
             {
                 System.out.println(transactions[i] + "\n");
                 balance = balance + transactions[i];
             }
         }
         System.out.println();
         System.out.println( "Balance: " + balance + " kr" + "\n" );
         System.out.println();
     }
     
     public static void makeTransactions
             (int amount, int [] transactions)
     {
         int position = findNr (transactions);
         if(position == -1)
         {
             moveTrans(transactions);
             position = findNr (transactions);
             transactions[position] = amount;
         }
         else
         {
             transactions[position] = amount;
         }
     }
     
     public static void findNr(int [] transactions)
     {
         int position = -1;
         
         for(int i = 0; 1 < transactions.length- 1; i++)
         {
             if(transactions[i] == 0)
             {
                 position = i;
                 break;
             }
         }
         return position;
     }
     
     public static void moveTrans(int [] transactions)
     {
         for(int i = 0; i < transactions.length- 1; i++)
             
             transactions[ 0] = transactions[i + 1];
     }
}