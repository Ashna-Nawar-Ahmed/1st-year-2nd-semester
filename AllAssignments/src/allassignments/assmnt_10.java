/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allassignments;

import java.util.Arrays;
import java.util.Scanner;

public class assmnt_10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int i, pos, x,n;
        System.out.println("Enter no.of integers:");
        n = input.nextInt();
        int ar[] = new int[n+1];
        System.out.println("Enter integers:");
        for (i = 0; i < n; i++) {
            if (input.hasNextInt()) {
                ar[i] = input.nextInt();
            }
        }
        System.out.println("Enter position:");
        pos = input.nextInt();
        System.out.println("Enter integer to be inserted:");
        x = input.nextInt();
        for (i = n-1; i >= pos; i--) {
            ar[i + 1] = ar[i];
        }
        ar[pos]=x;
        System.out.println("New array:");
        for (i = 0; i <= n; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}
