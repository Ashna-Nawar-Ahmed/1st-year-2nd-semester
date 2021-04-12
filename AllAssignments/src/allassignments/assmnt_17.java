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
public class assmnt_17 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int r1, r2, c1, c2, i, j, k, sum;
        System.out.println("Enter rows of matrix 1:");
        r1 = input.nextInt();
        System.out.println("Enter columns of matrix 1:");
        c1 = input.nextInt();
        System.out.println("Enter rows of matrix 2:");
        r2 = input.nextInt();
        System.out.println("Enter columns of matrix 2:");
        c2 = input.nextInt();
        int mat1[][] = new int[r1][c1];
        int mat2[][] = new int[r2][c2];
        int prod[][] = new int[r1][c2];

        System.out.println("Enter elements of Matrix 1:");
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c1; j++) {
                if (input.hasNextInt()) {
                    mat1[i][j] = input.nextInt();
                }
            }
        }
        System.out.println("Enter elements of Matrix 2:");
        for (i = 0; i < r2; i++) {
            for (j = 0; j < c2; j++) {
                if (input.hasNextInt()) {
                    mat2[i][j] = input.nextInt();
                }
            }
        }
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c2; j++) {
                sum = 0;
                for (k = 0; k < r2; k++) {
                    sum+=mat1[i][k]*mat2[k][j];
                }
                prod[i][j]=sum;
            }
        }
        System.out.println("Product of the two matrices:");
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c2; j++) {
                System.out.print(prod[i][j] + " ");

            }
            System.out.print("\n");
        }
    }
}
