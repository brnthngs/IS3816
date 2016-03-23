/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LostCause;

import ATM.*;
import java.io.*;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.lang.NullPointerException;

/**
 *
 * @author bpwc0b
 */
public class Account implements Serializable
{

    double balance;
    protected double amount;
    protected int firstdate;
    protected int seconddate;
    protected Calendar cal1 = new GregorianCalendar();
    protected Calendar cal2 = new GregorianCalendar();
    protected boolean dateflag = false;
    boolean ck = false;
    boolean sv = false;
    double rate;
    String menuItem;
    double acctBalance;
    double balanceNew;
    double balanceOld;
    protected String firstName;
    protected String lastName;
    transient Scanner sc = new Scanner(System.in);
    double depAmt;
    double withAmt;
//    Checking checking = new Checking();
//    Savings savings = new Savings();
    Account(String firstName, String lastName, double balance)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }
    Account()
    {
        
    }
  //  Account acct = new Account();
    

//    public void setAcctName(String lastName, int i)
//    {
//        ArrayList<Account> accounts;
//    }

//    Account() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }


    double Deposit()
    {
        this.amount += amount;
        System.out.println("Please enter the deposit amount:");
        depAmt = sc.nextDouble();
        balance = getBalance() + depAmt;
        System.out.printf("Your new balance is $%.02f\n", getBalance());
        return getBalance();
    }

    public double Withdraw()
    {
        System.out.println("Please enter the amount to withdraw:");
        withAmt = sc.nextDouble();
        balance = getBalance() - withAmt;
        System.out.printf("Your new balance is $%.02f\n", getBalance());
        return getBalance();
    }

    public void CheckBalance()
    {
        System.out.println("You are in Check Balance");
        System.out.println("");
        System.out.printf("Your current balance is $%.02f\n", getBalance());
    }

    public void calcInterest() throws IOException
    {
        getDate1();
        getDate2();
        getInterest();
    }

    public String setFirstName()
    {
        System.out.print("Please enter your first name:");
        firstName = sc.next();
        return getFirstName();
    }

    public String setLastName()
    {
        System.out.print("Please enter your first name:");
        lastName = sc.next();
        return getLastName();
    }

    public void getInterest()
    {
        int datediff = seconddate - firstdate;
        rate = .05 / 365;
        double ratetime = Math.pow(1 + getRate(), datediff);
        balance = getBalance() * ratetime;
        firstdate = seconddate;
        System.out.printf("Your new balance is $%.02f", getBalance());
        System.out.println("");
    }

    public void getDate1() throws IOException
    {
        System.out.print("Enter your first date(mm/dd/yyyy): ");
        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));
        String inputText = br.readLine();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        ParsePosition pos = new ParsePosition(0);
        Date mydate = formatter.parse(inputText, pos);
        cal1.setTime(mydate);
        firstdate = cal1.get(Calendar.DAY_OF_YEAR);
        dateflag = true;
    }

    /*
    
     */
    public void getDate2() throws IOException
    {
        System.out.print("Enter your second date(mm/dd/yyyy): ");
        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));
        String inputText = br.readLine();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        ParsePosition pos = new ParsePosition(0);
        Date mydate = formatter.parse(inputText, pos);
        cal1.setTime(mydate);
        seconddate = cal1.get(Calendar.DAY_OF_YEAR);
        dateflag = true;
    }

    /**
     * @return the balance
     */
    public double getBalance()
    {
        return balance;
    }

    /**
     * @return the rate
     */
    public double getRate()
    {
        return rate;
    }

    /**
     * @return the firstName
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName()
    {
        return lastName;
    }

    boolean accountType()
    {
        boolean quit = false;
        do
        {
            System.out.println("|-----------------------------------------------|");
            System.out.println("|         Welcome to your Bank Account:         |");
            System.out.println("|-----------------------------------------------|");
            System.out.println("|            Choose an option below:            |");
            System.out.println("|                                               |");
            System.out.println("|             1.  Checking                      |");
            System.out.println("|             2.  Savings                       |");
//            System.out.println("|             3.                                |");
//            System.out.println("|             4.  Calc Intrest                  |");
            System.out.println("|            99.  Exit                          |");
            System.out.println("|-----------------------------------------------|");
            menuItem = sc.next();
            switch (Integer.parseInt(menuItem))
            {
                case 1:
                {
                    System.out.println("You have choosen to create a Checking Account:");
//                    Account acct = new Account();
                    ATM am = new ATM();
                    
                    boolean ck = true;
                    quit = true;
                    return ck = true;
                }
                case 2:
                {
                    System.out.println("You have choosen to create a Savings Account:");
                    //savings.getRate();
                    boolean sv = true;
                    quit = true;
                    return sv = true;
//                    break;
                }
                case 99:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid menu choice, please make another"
                            + " selection.");
            }
        } while (!quit);
        return quit = true;
        

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
            menuItem = sc.next();
            switch (Integer.parseInt(menuItem))
            {
                case 1:
                {
                    System.out.println("You have choosen to deposit:");
                    Deposit();
                    break;
                }
                case 2:
                {
                    System.out.println("You have choosen to withdraw:");
                    Withdraw();
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
