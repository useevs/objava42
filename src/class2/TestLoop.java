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
public class TestLoop {

    public static void main(String[] args) {

        // 1. While
        //start->1,inc->2,inc->3,inc->4,inc->5,inc->6,inc->7,inc->8,inc->9,inc->10->condition == 10
        int a = 1; // initialization
        while (a <= 10) { // condition
            System.out.println("2 X " + a + " = " + (2 * a));// statement
            a++; // increment
        }

        // 2. Do While
        int b = 0; // initialization
        do {
            System.out.println(b); // statement
            b++; // increment
        } while (b < 10); // condition

        // 3. For Loop
        // for ( initiazation ; condition ; increment
        for (int c = 0; c < 10; c++) {
            System.out.println(c); // statement
        }

        // Nested Loops
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i + ":" + j);
            }
        }

    }
}
