/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewATM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author wetteb
 */
class Account
{

    private String name;
    private double amount;
    private double balance;
    private int firstdate;
    private int seconddate;
    private Calendar date1 = new GregorianCalendar();
    private Calendar date2 = new GregorianCalendar();
    private boolean dateflag = false;
    private double rate;

    

    
        public void menu() throws IOException
    {
        char mychar = 'z';
        while (mychar != 'e')
        {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("*********************************");
            System.out.println("*    WELCOME TO RIPUOFF BANK    *");
            System.out.println("*                               *");
            System.out.println("*     Come in and check out     *");
            System.out.println("*          our low 30%          *");
            System.out.println("*      interest rate loans      *");
            System.out.println("*                               *");
            System.out.println("*********************************");
            System.out.println();
            System.out.println("Please enter a choice:");
            System.out.println("Deposit(d)");
            System.out.println("Withdraw(w)");
            System.out.println("CheckBalance(c)");
            System.out.println("Exit(e)");
            BufferedReader br;
            String input;
            int index = 0;
            br = new BufferedReader(new InputStreamReader(System.in));

            input = br.readLine();

            mychar = input.charAt(index);

            if (mychar == 'd' || mychar == 'D')
            {
                System.out.println("Your current balance is:" + amount);
                if (dateflag == true)
                {
                    getDate2();
                    getInterest();
                    deposit();
                } else
                {
                    getDate1();
                    deposit();
                }

            } else if (mychar == 'w')
            {
                System.out.println("Your current balance is: " + amount);
                if (dateflag == true)
                {
                    getDate2();
                    getInterest();
                    withdraw();
                } else
                {
                    getDate1();
                    withdraw();
                }
            } else if (mychar == 'c')
            {
                System.out.println("Your current balance is: " + amount);
            }
        }
    }

//    Account(long amount, String name)
    Account(double amount)
    {
        this.name = name;
        setAmount(amount);
    }
    
    

    void deposit(double amount)
    {
        this.amount += amount;
    }

    void withdraw(double amount)
    {
        this.amount -= amount;
    }

    String getName()
    {
        return name;
    }

    double getAmount()
    {
        return amount;
    }

    void setAmount(double amount)
    {
        this.amount = amount;
    }
    public void getInterest()
    {
        int datediff = seconddate - firstdate;
        rate = .05 / 365;
        double ratetime = Math.pow(1 + rate, datediff);
        balance = balance * ratetime;
        firstdate = seconddate;

    }
    public void getDate1() throws IOException
    {

        System.out.print("Enter todays date(mm/dd/yyyy): ");
        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));
        String inputText = br.readLine();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        ParsePosition pos = new ParsePosition(0);
        Date date = new Date();
        date = formatter.parse(inputText, pos);

        date1.setTime(date);

        firstdate = date1.get(date1.DAY_OF_YEAR);
        dateflag = true;

    }
    public void getDate2() throws IOException
    {

        System.out.print("Enter todays date(mm/dd/yyyy): ");
        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));
        String inputText = br.readLine();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        ParsePosition pos = new ParsePosition(0);
        Date date = new Date();
        date = formatter.parse(inputText, pos);

        date2.setTime(date);

        seconddate = date2.get(date2.DAY_OF_YEAR);

        if (firstdate > seconddate)
        {
            System.out.println("You must enter a future date.");
            getDate2();
        }

    }

    private void deposit()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void withdraw()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
