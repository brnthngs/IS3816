/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umsl.Puzzles;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * @author bpwc0b
 */

public class Student
{
 private String ID;
 private float Exam1;
 private float Exam2;
        public static final String instructor = "Lawton";
 public static int counter;
       
               
        public Student()
        {
            ID = new String("1001");
            ID = "1001";
            Exam1 = new Float(100);
            Exam1 = 100f;
            Exam2 = 100;
            counter++;
        }
       
        public Student(String param_ID, float Ex1, float Ex2)
        {
            this.ID = param_ID;
            Exam1 = Ex1;
            Exam2 = Ex2;
            counter++;
        }
       
 public void setID(String s){
  ID = new String(s);
 }

 public void setExam1(float e1){
  Exam1 = e1; 
 }
 
 public void setExam2(float e2){
  Exam2 = e2; 
 }
 
 public void showAll(){
  System.out.println();
  System.out.println("Student ID: " + ID);
  System.out.println("Exam 1: " + Exam1);
  System.out.println("Exam 2: " + Exam2);
                double myavg = calcAvg();
  System.out.println("Average score: " + myavg);
                char mylg = calcLetterGrade(myavg);
                System.out.println("Your letter grade is: " + mylg);
                //calcAvg();
 }
       
        public double calcAvg()
        {
            double localAvg = (Exam1 + Exam2)/2.0f;
            final NumberFormat df = DecimalFormat.getInstance();
            df.setMinimumFractionDigits(2);
            df.setMaximumFractionDigits(2);
            //df.setRoundingMode(RoundingMode.DOWN);
            return Double.parseDouble(df.format(localAvg));
            //return
            //System.out.println( "Average Score: " + (Exam1 + Exam2)/2);
        }
      
       
        private char calcLetterGrade(double input)
        {
            //int  sumA, sumB, sumC, sumD, sumF;
            //sumA=sumB=sumC=sumD=sumF=0;
            char letterGrade;
            //while(input != -99){

            if(input>=90){
                //sumA++;
                //System.out.println(input + "      A");
                letterGrade = 'A';
     }
            else if(input >= 70){
                //sumB++;
                //System.out.println(input + "      B");
                letterGrade = 'B';
            }
            else if(input >= 50){
                //sumC++;
                //System.out.println(input + "      C");
                letterGrade = 'C';
            }
            else if(input >= 35){
                //sumD++;
                //System.out.println(input + "      D");
                letterGrade = 'D';
            }
            else{
                //sumF++;
                //System.out.println(input + "      F");
                letterGrade = 'F';
            }

            //input = kbd.readInt();
        //}
       

            return letterGrade;
        }

 }
       
//} // end class Student
    

