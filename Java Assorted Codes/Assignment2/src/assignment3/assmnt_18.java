/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import java.util.Scanner;
import java.util.Arrays;

public class assmnt_18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ar1[][] = new int[2][2];
        int ar2[][] = new int[2][2];
        int i, j, temp;
        System.out.println("Enter elements of 2x2 array: ");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                if (input.hasNextInt()) {
                    ar1[i][j] = input.nextInt();
                }
            }
        }
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                ar2[i][j] = ar1[j][i];
            }
        }
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print(ar2[i][j] + " ");
            }
            System.out.println("\n");
        }

    }

}
