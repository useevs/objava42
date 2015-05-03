/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class12;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shahzad
 */
public class TestSerialization {

    public static void main(String[] args) {

        // Write 
        ObjectOutputStream fout = null;
        try {
            fout = new ObjectOutputStream(
                    new FileOutputStream("c:/serial.txt")
            );
            fout.writeObject(new TestObject(4, "Shahzad Masud", 39.0, 3333337775L));

            fout.flush();
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
