/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.assignment;

/**
 *
 * @author USER
 */
public class JavaAssignment4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int t0 = 0, t1 = 1, tn = 0, i, n;
        n = 6;
        System.out.println("Terms: ");
        for (i = 1; i <= n; i++) {
            tn = t0 + t1;
            t0 = t1;
            t1 = tn;
            System.out.println(+tn);
        }

    }

}
