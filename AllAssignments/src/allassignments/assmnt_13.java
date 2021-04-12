/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allassignments;

import java.util.Scanner;


public class assmnt_13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, j, temp, k = 0,n;
        System.out.println("Enter no.of integers:");
        n = input.nextInt();
        
        int ar1[] = new int[n];
        int ar2[] = new int[n];
        int arr[] = new int[n+n];
        
        System.out.println("Enter "+n+" integers for 1st array:");
        for (i = 0; i < n; i++) {
            if (input.hasNextInt()) {
                ar1[i] = input.nextInt();
            }
        }
        System.out.println("Enter "+n+" integers for 2nd array:");
        for (i = 0; i < n; i++) {
            if (input.hasNextInt()) {
                ar2[i] = input.nextInt();
            }
        }
        //arranging array-1
        for (j = 0; j < n-1; j++) {
            for (i = 0; i < n-1 - j; i++) {

                if (ar1[i] > ar1[i + 1]) {
                    temp = ar1[i + 1];
                    ar1[i + 1] = ar1[i];
                    ar1[i] = temp;

                }
            }

        }
        //arranging array-2
        for (j = 0; j < n; j++) {
            for (i = 0; i < n-1 - j; i++) {

                if (ar2[i] > ar2[i + 1]) {
                    temp = ar2[i + 1];
                    ar2[i + 1] = ar2[i];
                    ar2[i] = temp;

                }
            }

        }
        //merging arrays
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (ar1[i] < ar2[j]) {
                    arr[k] = ar1[i];
                    k++;
                } else if (ar1[i] > ar2[j]) {
                    arr[k] = ar2[i];
                    k++;
                } else if (ar1[i] == ar2[j]) {
                    arr[k]=ar1[i];
                    k++;
                    arr[k]=ar2[j];
                    k++;
                }
            }
        }
        System.out.println("Merged array:");
        for(i=0;i<2*n;i++)
            System.out.println(arr[i]);
    }
}
