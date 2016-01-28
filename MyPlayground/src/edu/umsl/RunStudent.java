/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umsl;

import java.util.HashSet;
import java.util.Scanner;



/**
 *
 * @author lawtonb
 */
public class RunStudent
{
    Student s1 = null;
    Student s2 = null;
    public static void main(String args[])
    {
        RunStudent rs = new RunStudent();
        rs.menu();
    }
    
    public void menu()
    {
        int input;
        do
            {
            System.out.println("1)create student            *");
            System.out.println("2)show student              *");
            System.out.println("3)exit                      *");

            Scanner sc = new Scanner(System.in);

            input = sc.nextInt();


            if(input == 1)
                {
                    s1 = new Student();
                    s2 = new Student();

                    s1.setfname("Brian");
                    s1.setLname("Lawton");
                    s1.setExam1(70);
                    s1.setExam2(88);

                    s2.setfname("Cam");
                    s2.setLname("Newton");
                    s2.setExam1(99);
                    s2.setExam2(88);
                    //Instantiate and instance of student
                    //use the setters and getters to set name and exam scores

                }
            else if(input == 2)
                {
//                    if (s1 != null)
//                        {
//                        System.out.println("First Name: " + s1.getfname());
//                        System.out.println("Last Name: " + s1.getLname());
//                        System.out.println("Exam 1: " + s1.getExam1());
//                        System.out.println("Exam 2: " + s1.getExam2());
//                        System.out.println("Student Average: " + 
//                                s1.getStudentAvg());
//                        }
                    s1.showStudent();
                    s2.showStudent();

                    // in the student class create a method that calculates the average
                    // from here use the student reference(s) to call a method in 
                    // the student class that will print out student name, exam 
                    // scores, and average
                }
            else
                {
                    System.out.println("Invalid input, system closing now");
                }
            }
        while(input != 3);
    }

}
