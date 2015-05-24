/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class13;

import java.util.Observer;

/**
 *
 * @author shahzad
 */
public class TestObserver {

    public static void main ( String[] args ) {
        Teacher t = new Teacher () ; // observable 
        
        Observer[] students = {
            new Student("Ahmed", "ahmed@gmail.com"),
            new Student("Ali", "ali@adnan.com"),
            new Student("Mic", "mic@gmail.com") } ;
        
        for ( Observer o : students ) {
            t.addObserver(o);
        }
        
        t.addAssignment("Observe");
    }
}
