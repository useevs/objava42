/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class2;

/**
 *
 * @author shahzad
 */
public class TestVariable {

    public static void main(String[] args) {

        // Rule 1: It will start with a letter (a-z)
        // Rule 2: it can also start with $, _
        // Option 3: It should be meaningful
        // Option 4: It should follow camel case
        // Controversal 5: intNoOfStudent ;
        // Controversal 6: s_intNoOfStudents ;
//        int noOfStudents = 0 ;
//        int $1 ;
//        float f1 = 10.4F ;
//        long l = 2334323434343L ;
//        double d = 10.2 ;
//        boolean b = false ;
//        char c = 65 ; // 'A'
//        short s = 2 ;
//        byte ee = 1 ;
//        int a = 0 ; // 32
//        float b = 1.0f , b1 = 1.0f; // 32
//        long c = 1 ; // 64
//        double d = 1.0 ; // 64
//        short c1 = 1 , c2 = 1, c3 = 0 ; // 16
//       
//        c3 = (short) (c1 + c2) ; // Explicit Cast
//        a = (int) b + (int) b1 ; // (int) (b + b1) ;
//        c = a + (int) b ; // Explicit
//        b = a + c ; // Implicit
//        d = a + b + c + d ; // Implicit
//        a = (int) d ;
        // Byte --> Character --> Int --> Long --> Float --> Double
        // Short ---------------->
        // --> Implicit cast
        // <--- Explicit cast
        // 121233L --> 121233 = Value Loss
        // 12.09999999999 -> 12 = Precision Loss
        int a, b, c, d, e, f;
        a = b = c = d = e = f = 1;

//        a = a + 1 ; // binary addition
//        a += 1 ; // uniary addition
//        a ++ ; // post increment
//        ++ a ; // Pre increment
//        f = a++ + b++ + ++b ;
        //f = a++ + b++ + c++ + d++ + ++d + ++c + f++ ; // 9, 11
        //  1   + 1   + 1   + 1   + 3   + 3   + 1 ; // 11
        f = --a + b++ + --b - --c - ++d + c-- + f-- + --f; // 0, 4, 5
        //    0 + 1   +  1  - 0   - 2   + 0   + 1   + -1
    }
}
