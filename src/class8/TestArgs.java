/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class8;

/**
 *
 * @author shahzad
 */
public class TestArgs {

    public static void main(String[] args) {
        print(2, "two", 4, "Four", 4.5, "four point five");
        print(1);
        print(25, "anything", true, 4e4, false);
    }

    // Variable Argument
    public static void print(int aa, Object... s) {
        for (Object a : s) {
            System.out.print(" " + a);
        }
        System.out.println();
    }

}
