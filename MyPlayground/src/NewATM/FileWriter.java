/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewATM;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author wetteb
 */
public class FileWriter
{
    public static void main(String args[])
    {
    try
        {
            FileOutputStream fos = new FileOutputStream("file.out");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            //Test x = new Test("testing", 37);
            Account y = new account();
        double balance = 0;

            oos.writeObject(y);
            oos.flush();
            fos.close();
        }
        catch (Throwable e)
        {
            System.err.println(e);
        }
    }

}
