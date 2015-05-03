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
public class TestShift {

    public static void main(String[] args) {
        int a = 1;
        a = a << 1;
        a = a >> 2;

        a = (a >> 2) & 10 | 2;

        System.out.println(a);

        int b, c, d, e;
        a = b = c = d = e = 1;
//        a += b += c += d = 10 ;

//        a = (a + b + c + d+1) % 5 ;
        e /= a % b / (a + b);
    }
}
