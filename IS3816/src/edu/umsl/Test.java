/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.umsl;

import java.util.Scanner;

/**
 *
 * @author Benjamin
 */
public class Test 
{
    
    public static void main(String[] args)
    {
        System.out.println("Please enter a number");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        
        if (input >=80)
        {
            switch (input)
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
                    System.out.println("Invalid grade, please enter a number between "
                            + "0 - 100.");
            }
        }
            else 
                {
                    if (input > 70)
                    {
                        System.out.println("Your letter grade is a C");
                    }
                    else if (input > 60)
                    {
                        System.out.println("Your letter grade is a D");
                    }
                    else 
                    {
                        System.out.println("Your letter grade is an F");
                    }
                }
        }
    
    
}
