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
public class assmnt_4a {

    public static void main(String[] args) {
        int t0 = 0, t1 = 1, tn=0, i, n;
        n = 20;
        System.out.println("Fibonacci numbers are:");
        for (i = 2; i <= n; i++) {
            tn = t0 + t1;
            t0 = t1;
            t1 = tn;
            System.out.println(" " + tn);
        }
    }

}
