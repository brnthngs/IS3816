/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATM;

import java.io.*;
import java.util.*;
import java.lang.*;

/**
 *
 * @author bpwc0b
 */
public class ATM implements Serializable {

    int acctNumber;
    Scanner sc = new Scanner(System.in);
    public Account[] acct = new Account[3];

    public static void main(String[] args) throws IOException {
        ATM a = new ATM();
        try {
            a.ReadFile();
        } catch (Throwable e) {
            a.WriteFile();
        }

        a.mainMenu();
    }

    /**
     * First menu presented to user
     *
     * @throws java.io.IOException
     */
    public void mainMenu() throws IOException {
        int menuItem;
        Scanner sc = new Scanner(System.in);
        do {
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

            switch (menuItem) {
                case 1: {
                    System.out.println("You have selected your current Account:");
                    selectAcct();
                    break;
                }
                case 2: {
                    System.out.println("You have selected to create a new Account:");
                    createAcct();
                    break;
                }
                case 3: {
                    System.out.println("Index\tAccount\tFirstName\tLastName\tBalance");
                    System.out.println();
                    for (int counter = 0; counter < acct.length; counter++) 
                    {
                        System.out.println(counter + "\t" + acct[counter] + "\t" 
                                + acct[counter].firstName + "\t" + acct[counter].lastName
                        );
                    }
                }
                default: {
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
    public void createAcct() {
        for (int i = 0; i < acct.length; i++) {
            acctNumber = i;
            acct[i] = new Account();

            System.out.println("Please enter your First Name");
            String firstName = sc.next();
            System.out.println("Please enter your Last Name");
            String lastName = sc.next();
            acct[i].setAcctName(lastName, acctNumber);
            System.out.println("Account " + acct[i] + " belongs to "
                    + firstName + " " + lastName);
            acct[i].balance = 100.00;
            acct[i].rate = 0.05;
            System.out.printf("Your starting balance is $%.02f:", this.acct[i].getBalance());
            System.out.println("");
            System.out.printf("Your starting interest rate is %.02f", this.acct[i].getRate());
            System.out.println("");
        }
    }

    /**
     *
     */
    public void selectAcct() throws IOException {
        int menuInput;
        System.out.println("Please enter your account number");
        System.out.println(Arrays.toString(acct));
        menuInput = sc.nextInt();
        if (menuInput == 0) {
            System.out.println(Arrays.toString(acct));
            acct[menuInput].acctMenu();
        } else if (menuInput == 1) {
            System.out.println(Arrays.toString(acct));
            acct[menuInput].acctMenu();
        } else if (menuInput == 2) {
            System.out.println(Arrays.toString(acct));
            acct[menuInput].acctMenu();
        } else {
            System.out.println("Please enter a valid account number");
            selectAcct();
        }
    }

    public void WriteFile() {
        try {
            FileOutputStream fos = new FileOutputStream("Accountblah.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(acct);
            oos.flush();
            fos.close();
        } catch (Throwable e) {
            System.err.println(e);
        }
    }

    public void ReadFile() {
        try {
            FileInputStream fis = new FileInputStream("Accountblah.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            acct = (Account[]) ois.readObject();
            fis.close();
        } catch (Throwable e) {
            System.err.println(e);
        }
    }
}
