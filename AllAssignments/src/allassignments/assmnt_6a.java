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
public class assmnt_6a {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, n, flag = 1, j;
        System.out.println("Enter n:");
        n = input.nextInt();

        for (i = 2; i * i <= n; i++) {

            if (n % i == 0) {
                flag = 0;

            }

        }
        if (flag == 1) {
            System.out.println(n + " is a prime number.");

        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}
