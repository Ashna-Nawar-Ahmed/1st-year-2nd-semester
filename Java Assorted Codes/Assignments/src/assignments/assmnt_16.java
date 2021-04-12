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
public class assmnt_16 {

    public static void main(String[] args) {
        int[][] ar = new int[2][2];
        int[][] arr = new int[2][2];
        int[][] arry = new int[2][2];
        ar[0][0] = 1;
        ar[0][1] = 2;
        ar[1][0] = 3;
        ar[1][1] = 4;
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[1][0] = 3;
        arr[1][1] = 4;
        int i, j;
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                arry[i][j] = ar[i][j] + arr[i][j];
            }
        }
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print(" " + arry[i][j]);
            }
            System.out.println("\n");
        }

    }
}
