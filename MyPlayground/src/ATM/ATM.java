/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATM;

import java.io.*;
import java.util.*;


/**
 *
 * @author bpwc0b
 */
public class ATM implements Serializable
{

    public int acctNumber;
    Scanner sc = new Scanner(System.in);
    public Account[] acct = new Account[3];
 
    public static void main(String[] args) throws IOException
    {
        ATM a = new ATM();
        Account testobj;
        try
        {
            FileInputStream fis = new FileInputStream("Account1.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            testobj = (Account) ois.readObject();
            fis.close();
        } catch (Throwable e)
        {
            a.PopulateAccounts();
            a.WriteFile();
        }
        a.mainMenu();
    }

    /**
     * First menu presented to user
     *
     * @throws java.io.IOException
     */
    public void mainMenu() throws IOException
    {
        int menuItem;
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println("|-----------------------------------------------|");
            System.out.println("|            Welcome to WWSYM Bank!             |");
            System.out.println("|         (We Will Steal Your Money LLC)        |");
            System.out.println("|-----------------------------------------------|");
            System.out.println("|            Choose an option below:            |");
            System.out.println("|                                               |");
            System.out.println("|         1.  Access your current Account       |");
            System.out.println("|         2.  Create a new Account              |");
            System.out.println("|         3.  View Accounts                     |");
            System.out.println("|         99.  Exit                             |");
            System.out.println("|                                               |");
            System.out.println("|-----------------------------------------------|");
            menuItem = sc.nextInt();

            switch (menuItem)
            {
                case 1:
                {
                    System.out.println("You have selected your current Account:");
                    selectAcct();
                    break;
                }
                case 2:
                {
                    System.out.println("You have selected to create a new Account:");
                    createAcct();
                    break;
                }
                case 3:
                {
                    System.out.println("You have selected View Accounts:");
                    displayAcct();
                    break;
                }
                default:
                {
                    System.out.println("Invalid menu choice, please make another "
                            + "selection.");
                }
            }
        } while (menuItem != 99);
        WriteFile();
    }

    /**
     *
     */
    public void createAcct()
    {
        //for (int i = 0; i < acct.length; i++)
        {
            int i = 0;
//            acctNumber = i;
//            acct[i] = new Account();
            System.out.println("Please select your account number:");
            i = sc.nextInt();
            System.out.println("Please enter your First Name");
            this.acct[i].firstName = sc.next();
            System.out.println("Please enter your Last Name");
            this.acct[i].lastName = sc.next();
            this.acct[i].setAcctName(this.acct[i].lastName, this.acctNumber);
            System.out.println("Account " + acct[i] + " belongs to "
                    + this.acct[i].firstName + " " + this.acct[i].lastName);
            this.acct[i].balance = 100.00;
            this.acct[i].rate = 0.05;
            System.out.printf("Your starting balance is $%.02f:", this.acct[i].getBalance());
            System.out.println("");
            System.out.printf("Your starting interest rate is %.02f", this.acct[i].getRate());
            System.out.println("");
            WriteFile();
        }
    }

    /**
     *
     * @throws java.io.IOException
     */
    public void selectAcct() throws IOException
    {
        int menuInput;
        System.out.println("Please enter your account number");
        System.out.println(Arrays.toString(acct));
        menuInput = sc.nextInt();
        if (menuInput == 0)
        {
            System.out.println(Arrays.toString(acct));
            acct[menuInput].acctMenu();
        } else if (menuInput == 1)
        {
            System.out.println(Arrays.toString(acct));
            acct[menuInput].acctMenu();
        } else if (menuInput == 2)
        {
            System.out.println(Arrays.toString(acct));
            acct[menuInput].acctMenu();
        } else
        {
            System.out.println("Please enter a valid account number");
            selectAcct();
        }
    }

    public void WriteFile()
    {
        try
        {
            FileOutputStream fos = new FileOutputStream("Account1.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(acct);
            oos.flush();
            fos.close();
        } catch (Throwable e)
        {
            System.err.println(e);
        }
    }

    public void ReadFile()
    {
        try
        {
            FileInputStream fis = new FileInputStream("Account1.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            acct = (Account[]) ois.readObject();
            fis.close();
        } catch (Throwable e)
        {
            System.err.println(e);
        }
    }
    
    public void displayAcct()
    {
        
        System.out.println("Index\tAccount\t\t\tFirstName\tLastName\tBalance");
        System.out.println();
        {
            for (int i = 0; i < acct.length; i++)
            System.out.println(i + "\t" + this.acct[i] + "\t"
                    + this.acct[i].getFirstName() + "\t\t" + this.acct[i].getLastName() + "\t\t" + this.acct[i].getBalance()
            );
        }
    }

    private void PopulateAccounts()
    {
        for (int i = 0; i < acct.length; i++)
        {
            String firstName;
            String lastName;
            
            acctNumber = i;
            acct[i] = new Account();
            acct[i].firstName = "John";
            acct[i].lastName = "Doe";
            acct[i].setAcctName(acct[i].lastName, acctNumber);
            System.out.println("Account " + acct[i] + " belongs to "
                    + acct[i].firstName + " " + acct[i].lastName);
            acct[i].balance = 100.00;
            acct[i].rate = 0.05;
            System.out.printf("Your starting balance is $%.02f:", this.acct[i].getBalance());
            System.out.println("");
            System.out.printf("Your starting interest rate is %.02f", this.acct[i].getRate());
            System.out.println("");
            
        }
    }
}
