/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class assmnt_8 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ar[] = new int[5];
        int i, j, temp;
        System.out.println("Enter 5 integers:");
        for (i = 0; i < 5; i++) {
            if (input.hasNextInt())
                ar[i] = input.nextInt();
        }
        for (j = 0; j < 4; j++) {
            for (i = 0; i < 4 - j; i++) {

                if (ar[i] > ar[i + 1]) {
                    temp = ar[i + 1];
                    ar[i + 1] = ar[i];
                    ar[i] = temp;

                }
            }

        }
        System.out.println("Ascending order:");
        System.out.println(Arrays.toString(ar));
        
        for (j = 0; j < 4; j++) {
            for (i = 0; i < 4 - j; i++) {

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
