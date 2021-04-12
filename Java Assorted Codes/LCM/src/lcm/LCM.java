/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lcm;

/**
 *
 * @author USER
 */
public class LCM {

    /**
     * @param args the command line arguments
     */
    

        public static void main(String args[]) {
        int a = 6, b = 8, c = 12;
        int i, lcm = 0, max;
        if (a > b && a > c) {
            max = a;
        } else {
            if (b > a && b > c) {
                max = b;
            } else {
                max = c;
            }
        }
        for (i = max; i <= (a * b * c); i++) {
            if ( i%a == 0 && i%b == 0 && i%c == 0) {
                lcm = i;
                break;
            }
        }
        System.out.print("\nThe LCM is:" + lcm);
    }
}