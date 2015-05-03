/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class4;

/**
 *
 * @author shahzad
 */
public class TestStringBuffer {

    public static void main(String[] args) {

        //StringBuffer buf = new StringBuffer() ;
        StringBuilder buf = new StringBuilder();
        buf.append("first");
        buf.append(" second");
        buf.append(" third");
        buf.insert(5, " one.five");
        buf.append(" fourth");

        System.out.println(buf.toString());

    }
}
