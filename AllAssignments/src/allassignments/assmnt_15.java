/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allassignments;

import java.util.Scanner;

public class assmnt_15 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n, i, j, max, count = 0, k = 0, product = 1, min;
        System.out.println("Enter number of elements:");
        n = input.nextInt();
        int ar[] = new int[n];
        int lcm[] = new int[n];
        System.out.println("Enter elements:");
        for (i = 0; i < n; i++) {
            if (input.hasNextInt()) {
                ar[i] = input.nextInt();
            }
        }

        max = ar[0];
        for (i = 0; i < n; i++) {
            if (ar[i] > max) {
                max = ar[i];
            }
            product =product* ar[i];
        }
        for (i = max; i <= product; i++) {
            for (j = 0; j < n; j++) {
                if (i%ar[j] == 0) {
                    count++;
                    if (count == n) {
                        lcm[k] = i;
                        k++;
                    }
                } else {
                    break;
                }

            }

        }
        min = lcm[0];
        for (i = 0; i < k; i++) {
            if (lcm[i] < min) {
                min = lcm[i];
            }
        }
        System.out.println("\nThe LCM is:" + min);
    }
}
