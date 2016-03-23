/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewATM;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author wetteb
 */
class AccountDemo
{
    
    

    public static void main(String[] args)throws IOException
    {

    }

    Scanner sc = new Scanner(System.in);
    Account[] acct = new Account[3];
    SavingsAccount sa = new SavingsAccount(100);
    CheckingAccount ca = new CheckingAccount(100);
    

    public void mainMenu() throws IOException
    {
        int menuItem;
        
        do
        {
            System.out.println("|-----------------------------------------------|");
            System.out.println("|            Welcome to WWSYM Bank!             |");
            System.out.println("|         (We Will Steal Your Money LLC)        |");
            System.out.println("|-----------------------------------------------|");
            System.out.println("|            Choose an option below:            |");
            System.out.println("|                                               |");
            System.out.println("|         1.  Create a new Account              |");
            System.out.println("|         2.  View Accounts                     |");
            System.out.println("|         99.  Exit                             |");
            System.out.println("|                                               |");
            System.out.println("|                                               |");
            System.out.println("|-----------------------------------------------|");
            menuItem = sc.nextInt();

            switch (menuItem)
            {

                case 1:
                {
                    System.out.println("You have selected to create a new Account:");
                    accountType();
                    break;
                }
                case 3:
                {
                    System.out.println("You have selected View Accounts:");
                    break;
                    
                }
                default:
                {
                    System.out.println("Invalid menu choice, please make another "
                            + "selection.");
                }
            }
        } while (menuItem != 99);
    }
        
        public void accountType()
        {
            int menuItem2 = sc.nextInt();
        do

        {
            
            System.out.println("|-----------------------------------------------|");
            System.out.println("|            Welcome to WWSYM Bank!             |");
            System.out.println("|         (We Will Steal Your Money LLC)        |");
            System.out.println("|-----------------------------------------------|");
            System.out.println("|            Choose an option below:            |");
            System.out.println("|                                               |");
            System.out.println("|         1.  Checking Account                  |");
            System.out.println("|         2.  Saving Account                    |");
            System.out.println("|         99.  Exit                             |");
            System.out.println("|                                               |");
            System.out.println("|                                               |");
            System.out.println("|-----------------------------------------------|");
            

            switch (menuItem2)
            {

                case 1:
                {
                    System.out.println("You have selected Checking:");
                    break;
                }
                case 3:
                {
                    System.out.println("You have selected Savings:");
                    break;
                }
                default:
                {
                    System.out.println("Invalid menu choice, please make another "
                            + "selection.");
                }
            }
        } while (menuItem2 != 99);
    }
            public void acctMenu() throws IOException
    {

        boolean quit = false;
        do
        {
            System.out.println("|-----------------------------------------------|");
            System.out.println("|         Welcome to your Bank Account:         |");
            System.out.println("|-----------------------------------------------|");
            System.out.println("|            Choose an option below:            |");
            System.out.println("|                                               |");
            System.out.println("|             1.  Deposit                       |");
            System.out.println("|             2.  Withdraw                      |");
            System.out.println("|             3.  Check Balance                 |");
            System.out.println("|             4.  Calc Intrest                  |");
            System.out.println("|            99.  Exit                          |");
            System.out.println("|-----------------------------------------------|");
            int menuItem3 = sc.nextInt();
            switch (menuItem3)
            {
                case 1:
                {
                    System.out.println("You have choosen to deposit:");
                    deposit();
                    break;
                }
                case 2:
                {
                    System.out.println("You have choosen to withdraw:");
                    withdraw();
                    break;
                }
                case 3:
                {
                    System.out.println("You have choosen to check your "
                            + "balance:");
                    CheckBalance();
                    break;
                }
                case 4:
                {
                    System.out.println("You have choosen to calculate your "
                            + "intrest:");
                    calcInterest();
                    break;
                }
                case 99:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid menu choice, please make another"
                            + " selection.");
            }
        } while (!quit);
    }
}
        
//        SavingsAccount sa = new SavingsAccount(10000);
//        System.out.println("account name: " + sa.getName());
//        System.out.println("initial amount: " + sa.getAmount());
//        sa.deposit(5000);
//        System.out.println("new amount after deposit: " + sa.getAmount());
//
//        CheckingAccount ca = new CheckingAccount(20000);
//        System.out.println("account name: " + ca.getName());
//        System.out.println("initial amount: " + ca.getAmount());
//        ca.deposit(6000);
//        System.out.println("new amount after deposit: " + ca.getAmount());
//        ca.withdraw(3000);
//        System.out.println("new amount after withdrawal: " + ca.getAmount());
    
    

