/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class7;

/**
 *
 * @author shahzad
 */
public class Animal {

    // Use to represent Inheritance 
    // Attribute
    String type;

    public Animal(String type) {
        this.type = type;
    }

    public String sound() {
        return "Unknown ";
    }

    @Override
    public String toString() {
        return "Animal{" + "type=" + type + '}';
    }

}
