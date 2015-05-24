/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class12;

import java.util.Properties;

/**
 *
 * @author shahzad
 */
public class TestProperties {

    public static void main(String[] args) {
        Properties prop = System.getProperties();
        prop.setProperty("outputfilename", "c:/abc.txt");
        prop.list(System.out);

        System.out.println(prop.getProperty("outputfilename"));

        // java TestProperties test 123 = Command Line Argument
        // java TestProperties -Dtest=123 = Command line Properties
    }

}
