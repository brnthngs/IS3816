/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewATM;

import edu.umsl.Test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

/**
 *
 * @author wetteb
 */
public class RunATM
{

    static RunATM A1 = new RunATM();
    Scanner scan = new Scanner(System.in);
    static FileWriter w1 = new FileWriter();

    public static void main(String args[]) throws FileNotFoundException, IOException
    {
        Account accountNum = null;
        try
        {
            FileInputStream fis = new FileInputStream("file.out");
            ObjectInputStream ois = new ObjectInputStream(fis);
            accountNum = (Account) ois.readObject();
            fis.close();
        }
        catch (Throwable e)
        {
            
            System.err.println(e);
        }
//        System.out.println(accountNum.balance);
//        System.out.println(accountNum.);
//            
//        catch 
//        // if no file found, run create accounts

        A1.MainMenu1();
    }

    public void MainMenu1() throws IOException
    {

        String choice;
        
        double init = 0;
//        String c1 = null;
        Account a2 = new Account(init);
        System.out.println("Hello and Welcome to you local ATM");
        System.out.println("Have you used this ATM before?");
        System.out.println("Yes\t / \tNo\n");
        choice = scan.next();

        if (choice.equalsIgnoreCase("Yes"))
        {
            System.out.println("Now initializing Accounts");
            a2.accountSelect();

        } else if (choice.equalsIgnoreCase("No"))
        {
            System.out.println("Now initializing Populate Accounts");
            a2.accountSelect();
        } else
        {
            System.out.println("You have entered an invalid selection, please try again");
            MainMenu1();
        }

    }

}
