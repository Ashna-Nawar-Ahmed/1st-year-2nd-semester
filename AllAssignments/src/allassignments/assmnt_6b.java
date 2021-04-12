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
public class assmnt_6b {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, a, b, flag = 1, j;
        System.out.println("Enter a:");
        a = input.nextInt();
        System.out.println("Enter b:");
        b = input.nextInt();

        System.out.println("Prime Numbers within a & b are:");
        for (i = a; i <= b; i++) {
            flag=1;
            for (j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    flag = 0;

                }
                if (flag == 1) {
                    System.out.println(" " + i);
                }

            }

        }

    }
}
