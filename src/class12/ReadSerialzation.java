/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shahzad
 */
public class ReadSerialzation {

    public static void main(String[] args) {
        ObjectInputStream fout = null;
        try {
            fout = new ObjectInputStream(
                    new FileInputStream("c:/serial.txt")
            );
            //fout.writeObject(new TestObject(1, "Shahzad", 34.0, 55555L));
            Object obj = fout.readObject();
            if (obj.getClass() == TestObject.class) {
                TestObject to = (TestObject) obj;
                System.out.println(to);
            }
        } catch (Exception e) {
        } finally {
            if (fout != null) {
                try {
                    fout.close();
                } catch (IOException ex) {
                    Logger.getLogger(TestSerialization.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
