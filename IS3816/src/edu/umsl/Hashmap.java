/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

package edu.umsl;

/**
*
* @author bpwc0b
*/
public class Hashmap 
{
    public static void main(String[] args)
    {

    StudentArray sa = new StudentArray();     
    sa.initStu();
    }

    public void initStu()
    {

    String id;
    float ex1, ex2;
    Scanner sc = new Scanner(System.in);
    Student[] sarray = new Student[3];
    ArrayList<Student> alstu = new ArrayList<>();
    HashMap hm = new HashMap();

        for(int i=0; i<sarray.length; i++)
        {


            System.out.println("Please enter if you are a Grad or UnderGrad [G or UG]");

            String input = sc.next();

            if(input.equalsIgnoreCase("G"))
            {
            //sarray[i] = new GradStudent();
            alstu.add(1, new GradStudent());
            hm.put("test1", new GradStudent());


            }
            else if(input.equalsIgnoreCase("UG"))
            {
            sarray[i] = new UnderGradStudent();   
            }     
        }

        System.out.print("Enter ID#: [0,1 or 2]: ");
        id = sc.next();
        System.out.print("Enter Exam 1: ");
        ex1 = sc.nextFloat();
        System.out.print("Enter Exam 2: ");
        ex2 = sc.nextFloat();

        System.out.println("Please enter your number: ");
        int x = sc.nextInt();
        /*sarray[x].setID(id);
        sarray[x].setExam1(ex1);
        sarray[x].setExam2(ex2);
        sarray[x].showAll();
        sarray[x].showGrades();*/
        GradStudent gs = (GradStudent) hm.get("test1");

        alstu.get(x).setExam1(ex1);
        alstu.get(x).setExam2(ex1);
        alstu.get(x).showAll();
        //alstu.get(x).showGrades();
    }
}// end class StudentArray 

