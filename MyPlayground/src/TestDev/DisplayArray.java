/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestDev;
import java.io.*;
import java.util.*;
/**
 *
 * @author wetteb
 */
public class DisplayArray
{
    public int acctNumber;
    Scanner sc = new Scanner(System.in);
    public Array[] acct = new Array[3];
 
    public static void main(String[] args) throws IOException
    {
        DisplayArray da = new DisplayArray();
        da.PopulateAccounts();
        da.displayAcct();
    }
    
     public void displayAcct()
    {
        
        System.out.println("Index\tAccount\t\t\tFirstName\tLastName\tBalance");
        System.out.println();
        {
            for (int i = 0; i < acct.length; i++)
            System.out.println(i + "\t" + this.acct[i] + "\t"
                    + this.acct[i].getFirstName() + "\t\t" + this.acct[i].getLastName() + "\t\t" + this.acct[i].getBalance()
            );
        }
    }

    private void PopulateAccounts()
    {
        for (int i = 0; i < acct.length; i++)
        {
            String firstName;
            String lastName;
            
            acctNumber = i;
            acct[i] = new Array();
            acct[i].firstName = "John";
            acct[i].lastName = "Doe";
            acct[i].setAcctName(acct[i].lastName, acctNumber);
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
    

