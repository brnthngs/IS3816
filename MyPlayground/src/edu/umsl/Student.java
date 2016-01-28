/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umsl;

/*
 
  @author lawtonb
 */


public class Student
{
   private String fname;
   private String lname;
   private int exam1;
   private int exam2;
   private double studentAvg;
   
   public void setfname(String fname)
   {
       this.fname = fname;
   }
   
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
    }
    
    public void calcLetterGrade()
    {
        
    }
    
}
