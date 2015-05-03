/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class7;

import class8.FirstInterface;
import class8.SecondInterface;

/**
 *
 * @author shahzad
 */
public abstract class AnimalAbstract implements SecondInterface {

    // a. At least one method should be abstract
    // b. Class definition should have abstract keyword
    // c. Object cannot be created
    // d. Abstract method wouldn't implementation
    // Use to represent Inheritance 
    // Attribute
    String type;

    public AnimalAbstract(String type) {
        this.type = type;
    }

    public abstract String sound();

    @Override
    public String toString() {
        return "AnimalAbstract{" + "type=" + type + '}';
    }
    
    //public abstract void first() ; // FROM firstInterface

}
