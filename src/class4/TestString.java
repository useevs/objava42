/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class4;

import java.util.Scanner;

/**
 *
 * @author shahzad
 */
public class TestString {

    public static void main(String[] args) {
        char[] name = {'s', 'h', 'a', 'h', 'z', 'a', 'd'};
        System.out.println(String.valueOf(name));

        String n = "shahzad";
        String n1 = "shahzad";
        String n2 = new String("shahzad");

        if (n == n1) ; // True - referance
        if (n.equals(n1)) ; // True - value

        System.out.println(n);

        n = n + " masud";
        n1 = " masud";

        // Concatentation
        String new1 = "this" + "is" + "concat" + "example";
        n = n.concat("is").concat("a").concat("variable");

        n = null;
        n1 = null;
        System.gc();

        // Scanner
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            System.out.print("Input [" + i
                    + "]:");
            a[i] = scanner.nextInt();
        }

        String str = "a quick brown fox jumps over the lazy dog";
//        for ( int i = 0 ; i < str.length() ; i ++ ) {
//            if ( str.charAt(i) == ' ' ) {
//                // words
//            }
//        }
//        String[] splits = str.split(" ") ;
//        String[] asplit = str.split("a") ;
//        String[] asp = str.split("[ ,a,[,]]") ;
//        String[] vowel = str.split("[a|i|o|u|e]") ;

        //regexplanet.org
        // Search From a String
        int oIndex = str.indexOf("o"); // Search from Left
        int fIndex = str.indexOf("o", oIndex + 1); // +1 due to length of search string

        for (int idx = 0; idx != -1;) {
            idx = str.indexOf("o", idx + 1);
        }

        int lIndex = str.lastIndexOf("o"); // Search from Right
        int loIndex = str.lastIndexOf("o", lIndex);

        for (int idx = 0; idx != -1;) {
            idx = str.lastIndexOf("o", idx);
        }

        str = " a quick brown fox jumps over the lazy dog";

        // Sub String
        String quick = str.substring(2, 7); // quick
        String allexcepta = str.substring(2); // all except a

        // Trim
        String t1 = str.trim();

        // Concatentation Question
        String s = "shahzad";
        String s1 = "shahzad" + 1 + 1; // shahzad11
        String s2 = 1 + 1 + "shahzad"; // 2shahzad

    }
}
