/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignments;

/**
 *
 * @author USER
 */
public class assmnt_4b {

    public static void main(String[] args) {
        int t0 = 0, t1 = 1, tn = 0, i, a, b;
        a = 10;
        b = 40;
        System.out.println("Fibonacci numbers within a to b are:");
        for (i = 2; i <= b; i++) {
            tn = t0 + t1;
            t0 = t1;
            t1 = tn;
            if (tn >= a && tn <= b) {
                System.out.println(" " + tn);
            }
        }
    }

}
