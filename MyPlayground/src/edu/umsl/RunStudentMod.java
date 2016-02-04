/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umsl;

import java.util.Scanner;

/**
 *
 * @author bpwc0b
 */
public class RunStudentMod 
{
    StudentMod s1 = null;
    StudentMod s2 = null;
    public static void main(String args[])
    {
        RunStudentMod rs = new RunStudentMod();
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
                    s1 = new StudentMod();
//                    s2 = new StudentMod();
                    System.out.println("Enter your first name");
                    s1.setfname(sc.next());
                    System.out.println("Enter your surname");
                    s1.setLname(sc.next());
                    System.out.println("Enter your score for Exam 1");
                    s1.setExam1(sc.nextInt());
                    System.out.println("Enter your score for Exam 2");
                    s1.setExam2(sc.nextInt());

//                    s2.setfname("Cam");
//                    s2.setLname("Newton");
//                    s2.setExam1(99);
//                    s2.setExam2(88);
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
//                    s2.showStudent();

                    // in the student class create a method that calculates the average
                    // from here use the student reference(s) to call a method in 
                    // the student class that will print out student name, exam 
                    // scores, and average
                }
            else if(input == 3)
                {
                    System.out.println("You have selected to exit, the system "
                            + "is now closing");
                    break;
                }
            else 
            {
                System.out.println("Invalid input, system closing now");
            }
            }
        while(input != 3);
    }

}
