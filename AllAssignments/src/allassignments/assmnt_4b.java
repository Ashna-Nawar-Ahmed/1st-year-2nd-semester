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
public class assmnt_4b {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t0 = 0, t1 = 1, tn = 0, i, a, b;
        System.out.println("Enter a:");
        a = input.nextInt();
        System.out.println("Enter b:");
        b = input.nextInt();
        System.out.println("Fibonacci numbers within a to b are:");
        for (i = 2; i <= b; i++) {
            tn = t0 + t1;
            t0 = t1;
            t1 = tn;
            if (tn >= a && tn <= b) {
                System.out.println(" " + tn);
            }
        }
    }
}
