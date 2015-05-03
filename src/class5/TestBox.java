/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class5;

/**
 *
 * @author shahzad
 */
public class TestBox {

    public static void main(String[] args) {
        int[] values = {1, 4, 5, 3, 2, 17, 45, 20};
        Integer[] obj = new Integer[values.length];
        // Character --> char ;

        for (int i = 0; i < values.length; i++) {
            obj[i] = box(values[i]);
        }

        for (Integer i : obj) {
            System.out.println(unbox(i));
        }
    }

    public static Integer box(Integer obj) {
        return obj;
    }

    public static int unbox(int i) {
        return i;
    }
}
