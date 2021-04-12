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
public class assmnt_14 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n, i, j, min, count = 0, k = 0, max;
        System.out.println("Enter number of elements:");
        n = input.nextInt();
        int ar[] = new int[n];
        int gcd[] = new int[n];
        System.out.println("Enter elements:");
        for (i = 0; i < n; i++) {
            if (input.hasNextInt()) {
                ar[i] = input.nextInt();
            }
        }

        min = ar[0];
        for (i = 0; i < n; i++) {
            if (ar[i] < min) {
                min = ar[i];
            }
        }
        for (i = min; i >= 1; i--) {
            for (j = 0; j < n; j++) {
                if (ar[j] % i == 0) {
                    count++;
                    if (count == n) {
                        gcd[k] = i;
                        k++;
                    }
                } else {
                    break;
                }

            }

        }
        max = gcd[0];
        for (i = 0; i < k; i++) {
            if (gcd[i] > max) {
                max = gcd[i];
            }
        }
        System.out.println("\nThe GCD is:" + max);
    }
}
