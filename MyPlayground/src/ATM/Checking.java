/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATM;

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
        rate = .10;
        balance = 100;
    }

    /**
     *
     */
    @Override
    public void getInterest()
    {
        int datediff = seconddate - firstdate;
        setRate(.10 / 365);
        double ratetime = Math.pow(1 + getRate(), datediff);
        balance = getBalance() * ratetime;
        firstdate = seconddate;
        System.out.printf("Your new balance is $%.02f", getBalance());
        System.out.println("");
    }
}
    
//    void setRate()
//      {
//          this.
//      }
    


