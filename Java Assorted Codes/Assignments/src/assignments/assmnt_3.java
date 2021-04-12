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
public class assmnt_3 {

    public static void main(String[] args) {
        int num, i, j;
        num = 15;
        boolean primeNum;
        System.out.println("Prime factors are:");
        for (i = 2; i <= num; i++) {
            if (num % i == 0) {
                primeNum = true;

                for (j = 2; j <= (i / 2); j++) {
                    if (i % j == 0) {
                        primeNum = false;
                        break;
                    }
                }
                if (primeNum == true) {
                    System.out.println(" " + i);
                }
            }
        }
    }
}
