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
public class Checking extends Account 
{
     public void getInterest() {
        int datediff = seconddate - firstdate;
        rate = .05 / 365;
        double ratetime = Math.pow(1 + getRate(), datediff);
        balance = getBalance() * ratetime;
        firstdate = seconddate;
        System.out.printf("Your new balance is $%.02f", getBalance());
        System.out.println("");
     }
     
      public void createAcct() 
      {
        for (int i = 0; i < acct.length; i++) {
            acctNumber = i;
            acct[i] = new Account();

            System.out.println("Please enter your First Name");
            String firstName = sc.next();
            System.out.println("Please enter your Last Name");
            String lastName = sc.next();
            acct[i].setAcctName(lastName, this.);
            System.out.println("Account " + this + " belongs to "
                    + firstName + " " + lastName);
            this.balance = 100.00;
            this.rate = 0.05;
            System.out.printf("Your starting balance is $%.02f:", this.getBalance());
            System.out.println("");
            System.out.printf("Your starting interest rate is %.02f", this.getRate());
            System.out.println("");
        }
    
}
