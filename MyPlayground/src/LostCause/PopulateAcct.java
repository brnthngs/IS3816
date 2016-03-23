/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LostCause;

import java.util.Scanner;

/**
 *
 * @author bpwc0b
 */
public class PopulateAcct {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        PopulateAcct pop = new PopulateAcct();
        pop.PopulateAccounts();
    }
    Account[] acct = new Account[3];

    private void PopulateAccounts() {
        for (int i = 0; i < acct.length; i++) {
            Checking check = new Checking();
            Savings save = new Savings();
//            String firstName;
//            String lastName;
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
            } else {
                int acctNumber = i;
                acct[i] = new Account();
                acct[i].firstName = sc.next();
                acct[i].lastName = sc.next();
//            acct[i].setAcctName(acct[i].lastName, acctNumber);
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

}
