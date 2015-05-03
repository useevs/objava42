/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class3;

/**
 *
 * @author shahzad
 */
public class TestForLoop {

    public static void main(String[] args) {

        iloop:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 5) {
                    //break ; // terminate
                    continue iloop; // skip
                }
                System.out.println(i + ":" + j);
            }
        }

        one:
        for (int i = 0; i < 10; i++) {
            two:
            for (int j = 0; j < 10; j++) {
                three:
                for (int k = 0; k < 10; k++) {
                    if (i + j == 2) {
                        break one;
                    }
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = i; j < 10; j++) {
                for (int k = j; k < 10; k++) {

                    for (int m = k; m < 10; m++) {
                        for (int n = m; n < 10; n++) {
                            for (int o = n; o < 10; o++) {
                                if (i + j + k == m + n + o) {
                                    break;
                                }
                                System.out.println(i + "-" + j + "-" + k + "----"
                                        + m + "-" + n + "-" + o);
                            }
                        }
                    }
                }
            }
        }

    }
}
