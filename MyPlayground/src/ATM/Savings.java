/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATM;

/**
 *
 * @author Benjamin
 */
public class Savings extends Account 
{
       /**
     *
     */
    @Override
    public void getInterest()
    {
        int datediff = seconddate - firstdate;
        rate = .15 / 365;
        double ratetime = Math.pow(1 + getRate(), datediff);
        balance = getBalance() * ratetime;
        firstdate = seconddate;
        System.out.printf("Your new balance is $%.02f", getBalance());
        System.out.println("");
    }
    
}
