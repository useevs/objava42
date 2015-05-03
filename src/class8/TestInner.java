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
public class TestInner {
    
    // Encapsulation: Information hiding using access & scope 
    // modifier to make thing effective.
    
    public class InnerClass {
        // Can access any variable of TestInner class
    }
    
    public static class StaticInner {
        // Can only access static members
    }

    public static void main ( String[] args ) {
        TestInner ti = new TestInner() ;
        InnerClass ic = ti.new InnerClass() ;
        InnerClass ic1 = new TestInner().new InnerClass() ;
        
        StaticInner si = new TestInner.StaticInner() ;
    }
    
    // Assignment 4b
    // Define a class
    // Declare a constructor with private access
    // Create an object from a different package
    
}
// Not Recommended
class TestOutter {
    
}