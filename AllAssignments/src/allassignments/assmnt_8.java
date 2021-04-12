/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allassignments;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class assmnt_8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, j, temp, n;
        System.out.println("Enter n:");
        n = input.nextInt();
        int ar[] = new int[n];

        System.out.println("Enter n integers:");
        for (i = 0; i < n; i++) {
            if (input.hasNextInt()) {
                ar[i] = input.nextInt();
            }
        }
        for (j = 0; j < n - 1; j++) {
            for (i = 0; i < n - 1 - j; i++) {

                if (ar[i] > ar[i + 1]) {
                    temp = ar[i + 1];
                    ar[i + 1] = ar[i];
                    ar[i] = temp;

                }
            }

        }
        System.out.println("Ascending order:");
        System.out.println(Arrays.toString(ar));

        for (j = 0; j < n - 1; j++) {
            for (i = 0; i < n - 1 - j; i++) {

                if (ar[i] < ar[i + 1]) {
                    temp = ar[i + 1];
                    ar[i + 1] = ar[i];
                    ar[i] = temp;

                }
            }

        }
        System.out.println("Descending order:");
        System.out.println(Arrays.toString(ar));
    }
}
