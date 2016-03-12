/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestDev;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author wetteb
 */
public class Array

{

    double balance;
    protected int firstdate;
    protected int seconddate;
    protected Calendar cal1 = new GregorianCalendar();
    protected Calendar cal2 = new GregorianCalendar();
    protected boolean dateflag = false;
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

    public void setAcctName(String lastName, int i)
    {
        ArrayList<Array> accounts;
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

    public double Deposit()
    {
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
}
