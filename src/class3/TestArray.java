/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class3;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author shahzad
 */
public class TestArray {

    public static void main(String[] args) {
//        int week_a, b, c, d, e, f, g, h, i, j;
//        int[] p = new int[10] ;

        // 1.
        int[] p;// Declare
        p = new int[50]; // Initialize
        p[0] = 10; // Assign

        // 2.
        int[] p1 = new int[20]; // Declare + Init
        p1[0] = 10; // assigns

        // 3.
        int[] p2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Declare + init + Assign
        p2 = new int[]{3, 4, 5, 6, 7};

        for (int i = 0; i < p.length; i++) {
            p[i] = 10;
        }

        Arrays.fill(p, 20); // fill 20 in all elements
        Random rand = new Random();
        rand.nextInt(p.length);

        System.arraycopy(p, 0, p1, 0, p.length); // Copy Array
        p = p1;

        float[][] t = new float[10][10]; // fixed
        t = new float[4][]; // variable
        t[0] = new float[5];
        t[1] = new float[2];
        t[2] = new float[1];
        t[3] = new float[10];

        // linear
        for (int i = 0; i < t.length; i++) {
            t[i] = new float[i + 1];
        }

        float[][] t1 = {{1, 2, 3}, {2, 3}, {3}};

        //1// 1 2 3
        //2// 2 3
        //3// 3
        int val = 0;
        for (int i = 0; i < p.length; i++) {
            val = p[i];
            System.out.println(val);
        }

        for (int v : p) {
            System.out.println(v);
        }

        for (float[] f : t1) {
            for (float g : f) {
                System.out.println(g);
            }
        }
    }
}
