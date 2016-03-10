/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewATM;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author wetteb
 */
public class FileReader
{
    public static void main(String args[])
    {
        Account testobj = null;
        try
        {
                FileInputStream fis = new FileInputStream("file.out");
                ObjectInputStream ois = new ObjectInputStream(fis);
                testobj = (Account)ois.readObject();
                fis.close();
        }
        catch (Throwable e)
        {
                System.err.println(e);
        }
//        System.out.println(testobj.str);
//        System.out.println(testobj.ivalue);
    }
}

