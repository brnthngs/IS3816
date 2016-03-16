/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATM;

import java.io.File;

/**
 *
 * @author bpwc0b
 */
public class FileChecker 
{
    public static void main(String [] args)
    {
        File f = new File("Account1.txt");
        if(f.exists() && !f.isDirectory())
        {
            System.out.println("File exists");
        }
    }
}
