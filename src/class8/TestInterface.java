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
public class TestInterface implements FirstInterface, SecondInterface {

    @Override
    public void first() {
        System.out.println("Interface Implementation for Test Interface");
    }
    
    public static void main ( String[] args ){
        FirstInterface fi = new FirstInterface() {
            @Override
            public void first() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        }; 
    }
}
