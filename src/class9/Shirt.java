/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class9;

/**
 *
 * @author shahzad
 */
public class Shirt {

    private ShirtColor color;
    private ShirtSize size;

    public Shirt(ShirtColor color, ShirtSize size) {
        this.color = color;
        this.size = size;
    }

    public ShirtColor getColor() {
        return color;
    }

    public void setColor(ShirtColor color) {
        this.color = color;
    }

    public ShirtSize getSize() {
        return size;
    }

    public void setSize(ShirtSize size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Shirt{" + "color=" + color + ", size=" + size + '}';
    }

    public static void main(String[] args) {
        Shirt[] shirts = {
            new Shirt(ShirtColor.yellow, ShirtSize.small),
            new Shirt(ShirtColor.blue, ShirtSize.mediam),
            new Shirt(ShirtColor.green, ShirtSize.large),
            new Shirt(ShirtColor.red, ShirtSize.xlarge)
        };

        // All Colors 
        for (ShirtColor c : ShirtColor.values()) {
            System.out.print(" " + c);
        }
        System.out.println();

        // Size 
        for (ShirtSize s : ShirtSize.values()) {
            System.out.print(" " + s);
        }
        System.out.println();

        for (Shirt ss : shirts) {
            System.out.println(ss);
        }
    }
}
