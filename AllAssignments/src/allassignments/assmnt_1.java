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
public class assmnt_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter 1st integer:");
        a = input.nextInt();
        System.out.println("Enter 2nd integer:");
        b = input.nextInt();
        System.out.println("Enter 3rd integer:");
        c = input.nextInt();
        int i, lcm = 0, max;
        if (a > b && a > c) {
            max = a;
        } else {
            if (b > a && b > c) {
                max = b;
            } else {
                max = c;
            }
        }
        for (i = max; i <= (a * b * c); i++) {
            if (i % a == 0 && i % b == 0 && i % c == 0) {
                lcm = i;
                break;
            }
        }
        System.out.println("The LCM of 3 integers is:" + lcm);
    }

}
