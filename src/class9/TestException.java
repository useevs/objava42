/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class9;

import class10.MyException;

/**
 *
 * @author shahzad
 */
public class TestException {

    public static void main(String[] args) {

        int a = 0;

        try {
            System.out.println("Before Exception ... ");
            a = getInt("123d"); // Integer.valueOf("123"); // parseInt("123456");
            System.out.println("After ... ParseInt: " + a);
        } catch (MyException e) {
//            System.out.println("Exception: ... ParseInt:" + e.getMessage());
            e.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            // Runs in all scenarios
            // Close statements
            // No Return Statement
            // No Throw statement
        }
    }

    /**
     * This method would be used to parse string, and return integer value
     *
     * @param s This is String
     * @return This would return integer after parsing
     * @throws MyException
     */
    public static int getInt(String s)
            throws MyException, Exception {
        if (s == null) {
            // This is null value check 
            throw new Exception("Provided string value is null ");
        }
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            throw new MyException("What? ... ", e);
        }

    }
}
