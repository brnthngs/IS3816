/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LostCause;

import ATM.*;
import java.util.ArrayList;

/**
 *
 * @author Benjamin
 */
public class Checking extends Account
{
    public Checking()
    {
        super();
        System.out.println("Welcome to your new checking account:");
    }

    /**
     *
     */
    @Override
    public void getInterest()
    {
        int datediff = seconddate - firstdate;
        rate = .10 / 365;
        double ratetime = Math.pow(1 + getRate(), datediff);
        balance = getBalance() * ratetime;
        firstdate = seconddate;
        System.out.printf("Your new balance is $%.02f", getBalance());
        System.out.println("");
    }
    
//    @Override
//      public double getRate()
//    {
//        return rate;
    }
    


