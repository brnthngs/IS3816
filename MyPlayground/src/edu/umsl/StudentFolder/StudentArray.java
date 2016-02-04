/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.umsl.studentfolder;
import java.io.*;
import java.util.*;
/**
 *
 * @author lawtonb
 */
public class StudentArray
{
	Student[] sarray = new Student[3];
    
        public static void main(String[] args)
        {

               StudentArray sa = new StudentArray(); 
               sa.runStudents();

	}
        
        public void runStudents()
        {
                String id_holdinput;
		float ex1_holdinput, ex2_holdinput;
                Scanner sc = new Scanner(System.in);

		for(int i=0; i<sarray.length; i++)
                {
      
                        System.out.println("Please enter if you are a Grad or UnderGrad [G or UG]");
                        
                        String input = sc.next();
                    
			if(input.equalsIgnoreCase("G"))
                        {
                            sarray[i] = new GradStudent();
                            
                        }
                        else if(input.equalsIgnoreCase("UG"))
                        {
                            sarray[i] = new Undergrad();    
                        } 
                        else
                        {
                            sarray[i] = new Student();
                        }
		}

                        System.out.print("Enter ID#: [0 -Grad,1 - UG or 2 - nondegree]: ");
			id_holdinput= sc.next();
			System.out.print("Enter Exam 1: ");
			ex1_holdinput = sc.nextFloat();
			System.out.print("Enter Exam 2: ");
			ex2_holdinput = sc.nextFloat();
                        
                      System.out.println("Please enter your id number: ");
                      int x = sc.nextInt();
                        sarray[x].setID(id_holdinput);
			sarray[x].setExam1(ex1_holdinput);
			sarray[x].setExam2(ex2_holdinput);
                        sarray[x].showAll();
                        //sarray[x].
                        //sarray[x].average(); 
                
        }
	
}// end class StudentArray	
