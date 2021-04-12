/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allassignments;

import java.util.Scanner;

public class assmnt_5b {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, j, n, sum,count=0;
        System.out.println("Enter n:");
        n = input.nextInt();
        System.out.print("Perfect numbers within " + n + ":");
        for (i = 1; i < n; i++) {
            sum = 0;
            for (j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                System.out.print(i + " ");
                count++;
            } 
        }
        if(count==0)
        System.out.println("None");
    }

}
