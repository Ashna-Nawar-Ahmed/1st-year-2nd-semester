/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allassignments;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class assmnt_5c {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, j, n, sum = 0, perfnum = 0;
        System.out.println("Enter n:");
        n = input.nextInt();
        for (i = 1; i <= n;) {
            sum = 0;
            for (j = i; j <= i / 2; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                perfnum = sum;
                i++;
            }
        }
        System.out.println("Nth Term:" + perfnum);
    }
}
