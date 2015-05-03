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
public enum ShirtSize {

    small(36), mediam(40), large(42), xlarge(46), xxlarge(48);

    private int size;

    ShirtSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        switch (this) {
            case small:
                return "S";
            case mediam:
                return "M";
            case large:
                return "L";
            case xlarge:
                return "XL";
            case xxlarge:
                return "XXL";
            default:
                return "--";
        }
    }
}
