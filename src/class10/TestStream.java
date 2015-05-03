/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class10;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

/**
 *
 * @author shahzad
 */
public class TestStream {

    // 1. Input Stream
    // int read() ; // single byte read
    // int read(byte[]); // byte array read, size of read
    // int read ( byte[], int offset, int length ) ; // 
    // 2. Output Stream
    // void write ( byte b ) ; // single byte write
    // void write ( byte[] b ) ; // byte array write
    // void write ( byte[] b, int offset, int length ) ; // Customized Writing 
    public static void main(String[] args) {
        // BufferedInputStream = 8K Memory Buffer ( Array ) 
        // DataInputStream  = Primitives
        // CheckSumInputStream = Check Sum Maintenance 
        // CipherInputStream = Encrypt / Decrypt
        // DigestInputStream = One Way Encryption
        // InflatorInputStream = Compression 
        // ProgressMonitorInputStream = Progress Monitor
        // PushBackInputStream = Send Data back to source

//        InputStream is = new BufferedInputStream(System.in);
//        try {
//            byte[] b = new byte[8096];
//            System.out.print(">>");
//            int readBytes = is.read(b, 0, b.length);
//            String s = new String(b, 0, readBytes);
//            System.out.println(s);
//            System.out.println(is.available());
//        } catch (Exception e) {
//        }
//        Reader reader = new BufferedReader(
//                new InputStreamReader(System.in));
//        try {
//            char[] b = new char[8096];
//            System.out.print(">>");
//            int readBytes = reader.read(b, 0, b.length);
//            String s = new String(b, 0, readBytes);
//            System.out.println(s);
//        } catch (Exception e) {
//        }
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.next("[0-9]"));

        // Menu creation for your first term project
        // >> Login = A, T, S
        // a. Create Student = A
        // b. Create Teacher = A
        // c. Create class = A
        // d. Register Student = S
        // e. Create Assignment = T
        // f. Submit Assignment = S
        // g. Check Assignment = T, S
    }
}
