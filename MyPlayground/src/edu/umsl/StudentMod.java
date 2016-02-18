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

public abstract class StudentMod implements Serializable
{
    
    Scanner sc = new Scanner(System.in);
    private String fname;
    private String lname;
    private int exam1;
    private int exam2;
    private double studentAvg;
    private char myLetterGrade;

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

    private double calcAvg()
    {
        studentAvg = (((double)exam1 + exam2)/2.0);
        return studentAvg;
    }

    public void showStudent()
    {
        System.out.println("First Name: " + fname);
        System.out.println("Last Name: " + lname);
        System.out.println("Exam 1: " + exam1);
        System.out.println("Exam 2: " + exam2);
        System.out.println("Student Average: " + calcAvg());
        System.out.println("Your letter grade is " + 
                calcLetterGrade());
    }

    public char calcLetterGrade()
    {
        char lettergrade;
        if(studentAvg>=90)
        {
            myLetterGrade = 'A';
        }
        else if(studentAvg >= 80){
            myLetterGrade = 'B';
        }
        else if(studentAvg >= 70){
            myLetterGrade = 'C';
        }
        else if(studentAvg >= 60){
            myLetterGrade = 'D';
        }
        else{
            myLetterGrade = 'F';
        }
        return myLetterGrade;
        }

        
}
