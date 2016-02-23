/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umsl.Puzzles;

/**
 *
 * @author bpwc0b
 */

import java.io.*;
import java.util.*;
/**
 *
 * @author lawtonb
 */
public class StudentArray
{
 public static void main(String[] args)
        {
  //StudentArray sa = new StudentArray();
                //sa.runStudents();
                Scanner sc = new Scanner(System.in);
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
               
                Student s1 = new Student();
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
               StudentArray sa = new StudentArray();
               sa.runStudents();
                       
           
 }
       
        public void runStudents()
        {
                String id;
  float ex1, ex2;
  Scanner sc = new Scanner(System.in);
  Student[] sarray = new Student[3];
  
                for(int i=0; i<sarray.length; i++)
                {
                        System.out.print("Enter ID#: ");
   id = sc.next();
   System.out.print("Enter Exam 1: ");
   ex1 = sc.nextFloat();
   System.out.print("Enter Exam 2: ");
   ex2 = sc.nextFloat();
                       
   sarray[i] = new Student(id, ex1, ex2); 
                }    
        }
}

