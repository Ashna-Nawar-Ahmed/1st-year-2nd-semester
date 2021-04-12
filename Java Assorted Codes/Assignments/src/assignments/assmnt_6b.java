/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignments;

public class assmnt_6b {

    public static void main(String[] args) {
        int i, a, b, flag = 1, j;
        a = 5;
        b = 20;
        
        System.out.println("Prime Numbers are:");
        for (i = a; i <= b; i++) {
            for (j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    flag = 0;

                }
                if (flag == 1) {
                    System.out.println(" " + i);
                }

            }

        }

    }
}
