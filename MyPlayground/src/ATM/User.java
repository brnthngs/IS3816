/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATM;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author wetteb
 */
public class User 
{

    public static void main(String[] args) {
        //AccountArray sa = new AccountArray();
        //sa.runAccounts();
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Account s1 = new Account();
        System.out.println(s1.instructor);
        s1.showAll();
        s1.setID("007");
        /*System.out.println("Enter a exam score");
                try
                {
                float x = Float.parseFloat((br.readLine()));
                }
                catch(IOException x)
                {
                    System.out.println(x.getMessage());
                }*/
        //float x = sc.nextFloat();
        s1.setExam1(75.5f);
        s1.setExam2(85.7f);
        s1.showAll();
        System.out.println(s1.toString());

        //*******  Now it gets real
        AccountArray sa = new AccountArray();
        sa.runAccounts();

    }

    public void runAccounts() {
        String id;
        float ex1, ex2;
        Scanner sc = new Scanner(System.in);
        Account[] sarray = new Account[3];

        for (int i = 0; i < sarray.length; i++) {
            System.out.print("Enter ID#: ");
            id = sc.next();
            System.out.print("Enter Exam 1: ");
            ex1 = sc.nextFloat();
            System.out.print("Enter Exam 2: ");
            ex2 = sc.nextFloat();

            sarray[i] = new Account(id, ex1, ex2);
        }
    }
}

}
