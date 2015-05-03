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
public class TestLetter {

    public static void main(String[] args) {
//        char s = 'A' ; //65 ; //'A' ;
        Character s = 'A';
        System.out.println(s);
//        if ( s > 64 && s < 92 ) {
        if (Character.isUpperCase(s)) {
            System.out.println("Upper Case");
        } //        else if ( s > 96 && s < 124 ) {
        else if (Character.isLowerCase(s)) {
            System.out.println("Small Case");
        }

//        Integer i = 10 ;
//        Float f = 10.0F ;
//        Long l = 10L ;
//        Double d = 10.0 ;
//        Boolean b = false ;
//        Byte bb = 10 ;
        // Expression
        // if ( boolean = true ) {
        // statement(s) ;
        // } else {
        // false statement(s) ;
        // }
        int i = 0, j = 0;
        if (i == 0) {
            j = i + 1;
        } else {
            j = 1;
        }

        // boolean expression ? true statement : false statement
        j = i == 0 ? i + 1 : 1;

        i = 2;
        if (i == 0) {
            System.out.println("Zero");
        } else if (i == 1) {
            System.out.println("One");
        } else if (i == 2) {
            System.out.println("Two");
        } else {
            System.out.println("Nothing");
        }

        switch (i) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("Nothing");
                break;
        }

        System.out.println(
                i == 0 ? "Zero"
                        : i == 1 ? "One"
                                : i == 2 ? "Two " : "Nothing"
        );

    }
}
