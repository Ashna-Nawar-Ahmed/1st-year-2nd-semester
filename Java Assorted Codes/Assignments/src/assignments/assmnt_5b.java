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
public class assmnt_5b {

    public static void main(String[] args) {
        int i, j, n, sum;
        n = 29;
        for (i = 1; i < n; i++) {
            sum = 0;
            for (j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if(sum==i)
                System.out.println(i+" is a perfect number");
        }

    }
}
