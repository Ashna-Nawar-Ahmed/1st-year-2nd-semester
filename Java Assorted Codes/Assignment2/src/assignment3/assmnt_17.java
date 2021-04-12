/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import java.util.Scanner;
import java.util.Arrays;

public class assmnt_17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ar1[][] = new int[2][3];
        int ar2[][] = new int[3][2];
        int ar3[][] = new int[2][2];
        int i, j, k, sum;
        System.out.println("Enter elements of 2x3 matrix:");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 3; j++) {
                if (input.hasNextInt()) {
                    ar1[i][j] = input.nextInt();
                }
            }
        }
        System.out.println("Enter elements of 3x2 matrix:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 2; j++) {
                ar2[i][j] = input.nextInt();
            }
        }
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                sum = 0;
                for (k = 0; k < 3; k++) {
                    sum += ar1[i][k] * ar2[k][j];
                }
                ar3[i][j] = sum;
            }
        }
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print(ar3[i][j] + " ");
            }
            System.out.print("\n");
        }

    }
}
