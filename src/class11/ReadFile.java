/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class11;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shahzad
 */
public class ReadFile {

    public static void main(String[] args) {
        // 3. Write to File 
        BufferedInputStream fout = null;
        try {
            // 1 File Stream Building 
            fout = new BufferedInputStream(
                    new FileInputStream("c:/objava42.txt"));
            // 2 Read
            byte[] b = new byte[1024];
            int read = 0;
            StringBuilder buf = new StringBuilder();
            read = fout.read(b);
            while (read > 0) {
                buf.append(new String(b, 0, read));
                read = fout.read(b);
            }
            System.out.println(buf.toString());
        } catch (Exception e) {
        } finally {
            // Close File Object
            if (fout != null) {
                try {
                    fout.close();
                } catch (IOException ex) {
                    Logger.getLogger(TestFile.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }
}
