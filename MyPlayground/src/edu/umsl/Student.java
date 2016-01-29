/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umsl;

import java.util.Scanner;

/*

  @author lawtonb
 */

/*

*/
public class Student
{
    
    Scanner sc = new Scanner(System.in);
    private String fname;
    private String lname;
    private int exam1;
    private int exam2;
    private double studentAvg;

    /*

    */
    public void setfname(String fname)
    {
        this.fname = fname;
    }
    /*

    */
    public String getfname( )
    {
        return fname;
    }

    public String getLname() 
    {
        return lname;
    }

    public void setLname(String lname) 
    {
        this.lname = lname;
    }

    public int getExam1() 
    {
        return exam1;
    }

    public void setExam1(int exam1) 
    {
        this.exam1 = exam1;
    }

    public int getExam2() 
    {
        return exam2;
    }

    public void setExam2(int exam2) 
    {
        this.exam2 = exam2;
    }

    private void calcAvg ()
    {
        studentAvg = (exam1 + exam2)/2.0;
    }

    /**
     * @return the studentAvg
     */
    public double getStudentAvg() 
    {
        calcAvg();
        return studentAvg;
    }

    public void showStudent()
    {
        System.out.println("First Name: " + fname);
        System.out.println("Last Name: " + lname);
        System.out.println("Exam 1: " + exam1);
        System.out.println("Exam 2: " + exam2);
        System.out.println("Student Average: " + getStudentAvg());
        calcLetterGrade();
    }

    public void calcLetterGrade()
    {
        if (studentAvg >=80)
        {
            // Convert double to int to use the switch case statement
            double x = studentAvg;
            int stdAvg = (int)x;
            switch (stdAvg) 
            {
                case 100:
                case 99:
                case 98:
                case 97:
                case 96:
                case 95:
                case 94:
                case 93:
                case 92:
                case 91:
                case 90:
                    System.out.println("Your letter grade is an A");
                    break;
                case 89:
                case 88:
                case 87:
                case 86:
                case 85:
                case 84:
                case 83:
                case 82:
                case 81:
                case 80:
                    System.out.println("Your letter grade is a B");
                    break;
                default:
                    System.out.println("Invalid grade, please enter a number "
                            + "between 0 - 100");
            }
        }
            else 
                {
                    if (studentAvg > 70)
                    {
                        System.out.println("Your letter grade is a C");
                    }
                    else if (studentAvg > 60)
                    {
                        System.out.println("Your letter grade is a D");
                    }
                    else 
                    {
                        System.out.println("Your letter grade is an F");
                    }
                }




//        if(input>=90){
//                sumA++;
//                System.out.println(new Integer(input) + "      A");
//			}
//            else if(input >= 70){
//                sumB++;
//                System.out.println(new Integer(input) + "      B");
//            }
//            else if(input >= 50){
//                sumC++;
//                System.out.println(new Integer(input) + "      C");
//            }
//            else if(input >= 35){
//                sumD++;
//                System.out.println(new Integer(input) + "      D");
//            }
//            else{
//                sumF++;
//                System.out.println(new Integer(input) + "      F");
//            }
//
//            input = kbd.readInt();
        }
    }
