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
public class assmnt_19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i, determinant, j;
        int a[][] = new int[3][3];
        // int ar2[][] = new int[10][10];
        System.out.println("Enter elements of the 3x3 matrix: ");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();

        }
        determinant = a[0][0] * ((a[1][1] * a[2][2]) - (a[2][1] * a[1][2])) - a[0][1] * (a[1][0]
                * a[2][2] - a[2][0] * a[1][2]) + a[0][2] * (a[1][0] * a[2][1] - a[2][0] * a[1][1]);

        System.out.println("Determinant is: " + determinant);

    }
}
