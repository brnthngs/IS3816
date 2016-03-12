/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestDev;

/**
 *
 * @author wetteb
 */
public class NumAsString
{

    @Override
    public String toString()
    {
        int Num = -782;
        String numberAsString = Integer.toString(Num);
        return Num;
    }
    //The argument i is converted and returned as a string instance. If the number is negative, the sign will be preserved.
    //Example

    int number = -782;
    String numberAsString = Integer.toString(number);

//The code is equivalent to:
    public static void main(String args[])
    {
    

    public NumAsString()
    {
        String numberAsString = "-782";
        System.out.println("Number is " + numberAsString);
    }
}

