/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class11;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shahzad
 */
public class TestFile {

    public static void main(String[] args) {

        File myFile = new File("c:/abc.txt");
        File myDir = new File("c:/abc");
        File myFile1 = new File(myDir, "abc.txt");

//        try {
//            File remoteFile
//                    = new File(new URI("http://www.yahoo.com/abc.txt"));
//        } catch (URISyntaxException ex) {
//            Logger.getLogger(TestFile.class.getName()).log(Level.SEVERE, null, ex);
//        }
        // File Attributes
        // List all files with drive
//        File[] drives = File.listRoots();
//        for (File f : drives) {
//            File[] list = f.listFiles();
//            if (list != null) {
//                for (File s : f.listFiles()) {
//                    System.out.println((s.isFile()
//                            ? "--File--" : "--Dir--")
//                            + s.getPath());
//                }
//            }
//            //System.out.println(f);
//        }
        // File name Filter 
        FilenameFilter txtFilter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.toLowerCase().endsWith("txt");
            }
        };
        FileFilter dirFilter = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory();
            }
        };
        File[] drives = File.listRoots();
        for (File f : drives) {
            File[] list = f.listFiles(dirFilter);
            if (list != null) {
                for (File s : list) {
                    System.out.println((s.isFile()
                            ? "--File--" : "--Dir--")
                            + s.getPath());
                }
            }
            //System.out.println(f);
        }

        // 2. Mkdirs 
        File f1 = new File("c:/abc/cde/efg/hij/klm/nop");
        f1.mkdirs();

        // 3. Write to File 
        BufferedOutputStream fout = null;
        try {
            // 3.1 Fileout Stream Building 
            fout = new BufferedOutputStream(
                    new FileOutputStream("c:/objava42.txt", true));
            // 3.2 Write
            fout.write("\\nThis is first line".getBytes());

            // 3.3 Flush
            fout.flush();
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
