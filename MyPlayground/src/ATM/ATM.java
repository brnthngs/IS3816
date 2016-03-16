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
public class ATM implements Serializable {

    public int acctNumber;
    Scanner sc = new Scanner(System.in);
    private String accountType;

    public Account[] acct = new Account[3];

    public static void main(String[] args) throws IOException {
        ATM a = new ATM();
        {
            File f = new File("Account1.ser");
            if (f.exists() && !f.isDirectory()) {
                System.out.println("File exists, running main Menu");
                a.ReadFile();
                a.mainMenu();
            } else {
                System.out.println("File does not exist, running Populate Accounts");
                a.PopulateAccounts();
                a.WriteFile();
                a.mainMenu();
            }
        }
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
                    selectAccount();
                    break;
                }
                case 2: {
                    System.out.println("You have selected to create a new Account:");
                    createAcct();
                    break;
                }
                case 3: {
                    System.out.println("You have selected View Accounts:");
                    displayAcct();
                    break;
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

        {
            //for (int i = 0; i < acct.length; i++)
            {
                int i = 0;
//            acctNumber = i;
//            acct[i] = new Account();
                System.out.println("Please select your account number:");
                i = sc.nextInt();
                System.out.println("Would you like a checking or savings account?");
                System.out.println("Enter 1) for Checking");
                System.out.println("Enter 2) for Savings");

                int choice = sc.nextInt();
                if (choice == 1) {
                    acct[i] = new Checking();
                } else if (choice == 2) {
                    acct[i] = new Savings();
                }

                System.out.println("Please enter your First Name");
                acct[i].firstName = sc.next();
                System.out.println("Please enter your Last Name");
                acct[i].lastName = sc.next();
//            this.acct[i].setAcctName(this.acct[i].lastName, this.acctNumber);
                System.out.println("Account " + acct[i] + " belongs to "
                        + acct[i].firstName + " " + acct[i].lastName);
                acct[i].setBalance();
                acct[i].getRate();
                System.out.printf("Your starting balance is $%.02f:", acct[i].getBalance());
                System.out.println("");
                System.out.printf("Your starting interest rate is %.02f", acct[i].getRate());
                System.out.println("");
                WriteFile();
            }
        }
    }
//        {
//            int i = 0;
//
//            System.out.println("Please select your account number:");
//            i = sc.nextInt();
//            acct[i].accountType();
//            System.out.println("Checking switch = " + acct[i].ck);
//            System.out.println("Checking switch = " + acct[i].sv);
//
//            if (acct[i].ck == true) {
//                System.out.println("Please enter your First Name");
//                acct[i].firstName = sc.next();
//                System.out.println("Please enter your Last Name");
//                acct[i].lastName = sc.next();
////            acct[i].setAcctName(acct[i].lastName, acctNumber);
//                System.out.println("Account " + acct[i] + " belongs to "
//                        + acct[i].firstName + " " + acct[i].lastName);
//                acct[i].balance = 100.00;
//                acct[i].getRate();
//                System.out.printf("Your starting balance is $%.02f:", acct[i].getBalance());
//                System.out.println("");
//                System.out.printf("Your starting interest rate is %.02f", acct[i].getRate());
//                System.out.println("");
//            } else if (acct[i].sv == true) {
//                System.out.println("Please enter your First Name");
//                acct[i].firstName = sc.next();
//                System.out.println("Please enter your Last Name");
//                acct[i].lastName = sc.next();
////            acct[i].setAcctName(acct[i].lastName, acctNumber);
//                System.out.println("Account " + acct[i] + " belongs to "
//                        + acct[i].firstName + " " + acct[i].lastName);
//                acct[i].balance = 100.00;
//                acct[i].getRate();
//                System.out.printf("Your starting balance is $%.02f:", acct[i].getBalance());
//                System.out.println("");
//                System.out.printf("Your starting interest rate is %.02f", acct[i].getRate());
//                System.out.println("");
//            } else {
//                System.out.println("Please select your account type");
//                acct[i].accountType();
//            }
//            WriteFile();
//        }
//    }

    /**
     *
     * @throws java.io.IOException
     */
    public void selectAccount() throws IOException {
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
            selectAccount();
        }
    }

    public void WriteFile() {
        try {
            FileOutputStream fos = new FileOutputStream("Account1.ser");
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
            FileInputStream fis = new FileInputStream("Account1.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            acct = (Account[]) ois.readObject();
            fis.close();
        } catch (Throwable e) {
            System.err.println(e);
        }
    }

    public void displayAcct() {

        System.out.println("Index\tAccount\t\t\tFirstName\tLastName\tBalance\t\tRate");
        System.out.println();
        {
            for (int i = 0; i < acct.length; i++) {
                System.out.println(i + "\t" + acct[i] + "\t"
                        + acct[i].getFirstName() + "\t\t" + acct[i].getLastName() + "\t\t" + acct[i].getBalance()
                        + "\t\t" + acct[i].getRate());
            }
        }
    }

    private void PopulateAccounts() {
        for (int i = 0; i < acct.length; i++) {
            String firstName;
            String lastName;

            acctNumber = i;
            System.out.println("Would you like a checking or savings account?");
            System.out.println("Enter 1) for Checking");
            System.out.println("Enter 2) for Savings");

            int choice = sc.nextInt();
            if (choice == 1) {
                acct[i] = new Checking();
            } else if (choice == 2) {
                acct[i] = new Savings();
            }

            {

            }
            acct[i] = new Account();
            acct[i].firstName = "John";
            acct[i].lastName = "Doe";
//            acct[i].setAcctName(acct[i].lastName, acctNumber);
            System.out.println("Account " + acct[i] + " belongs to "
                    + acct[i].firstName + " " + acct[i].lastName);
            acct[i].balance = 100.00;
            acct[i].setRate(0.05);
            System.out.printf("Your starting balance is $%.02f:", acct[i].getBalance());
            System.out.println("");
            System.out.printf("Your starting interest rate is %.02f", acct[i].getRate());
            System.out.println("");

        }
    }
    /*
    
     private void PopulateAccounts() {
        
        
        
        
     for (int i = 0; i < acct.length; i++) {
     String firstName;
     String lastName;
     String b = sc.next();
     System.out.println("Please type Checking or Savings");
     if (b.equalsIgnoreCase("Checking")) {
     acct[i] = new Account();
     System.out.println("Please enter your first name");
     check.firstName = sc.next();
     System.out.println("Please enter your last name");
     check.lastName = sc.next();
     System.out.println("Account " + acct[i] + " belongs to "
     + acct[i].firstName + " " + acct[i].lastName);
     System.out.println("Your balance is " + check.balance);
     System.out.println("Your rate is " + check.rate);

     } else if (b.equalsIgnoreCase("Savings")) {
     acct[i] = new Account();
     save.firstName = sc.next();
     save.lastName = sc.next();
     System.out.println("Account " + acct[i] + " belongs to "
     + acct[i].firstName + " " + acct[i].lastName);
     System.out.println("Your balance is " + save.balance);
     System.out.println("Your rate is " + save.rate);
     } else 
     {
     acctNumber = i;
     acct[i] = new Account();
     acct[i].firstName = sc.next();
     acct[i].lastName = sc.next();
     acct[i].setAcctName(acct[i].lastName, acctNumber);
     System.out.println("Account " + acct[i] + " belongs to "
     + acct[i].firstName + " " + acct[i].lastName);
     acct[i].balance = 100.00;
     acct[i].rate = 0.05;
     System.out.printf("Your starting balance is $%.02f:", acct[i].getBalance());
     System.out.println("");
     System.out.printf("Your starting interest rate is %.02f", acct[i].getRate());
     System.out.println("");
     }

     }
     }
     */

}
