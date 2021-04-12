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
public class assmnt_18 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int r, c, i, j;
        System.out.println("Enter rows:");
        r = input.nextInt();
        System.out.println("Enter columns:");
        c = input.nextInt();
        int mat1[][] = new int[r][c];
        int mat2[][] = new int[c][r];
        System.out.println("Enter elements of Matrix 1:");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                if (input.hasNextInt()) {
                    mat1[i][j] = input.nextInt();
                }
            }
        }
        
        for (i = 0; i < c; i++) {
            for (j = 0; j < r; j++) {
                 mat2[i][j]=mat1[j][i];
                
            }
        }
        System.out.println("Transposed matrix:");
        for (i = 0; i < c; i++) {
            for (j = 0; j < r; j++) {
                System.out.print(mat2[i][j] + " ");

            }
            System.out.print("\n");
        }
    }
}
