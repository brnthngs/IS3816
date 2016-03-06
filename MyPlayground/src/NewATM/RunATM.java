/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewATM;

import java.util.Scanner;

/**
 *
 * @author wetteb
 */
public class RunATM
{
    static RunATM A1 = new RunATM();
    public Account acct = new Account();
    Scanner scan = new Scanner(System.in);
    public static void main(String args[])
    {
        A1.MainMenu1();
    }
    
    public void MainMenu1()
    {
        String choice;
        String c1 = null;
        
        System.out.println("Hello and Welcome to you local ATM");
        System.out.println("Have you used this ATM before?");
        System.out.println("Yes\t / \tNo\n");
        choice = scan.next();
        
        
        if (choice.equalsIgnoreCase("Yes"))
        {
            System.out.println("Now initializing Accounts");
            
//            acct.Account();
        }
        else if (choice.equalsIgnoreCase("No"))
        {
            System.out.println("Now initializing Populate Accounts");
        }
        else
        {
            System.out.println("You have entered an invalid selection, please try again");
            MainMenu1();
        }
//        try
//        // check for file
//            
//        catch 
//        // if no file found, run create accounts
                    
        

    }
    
}
