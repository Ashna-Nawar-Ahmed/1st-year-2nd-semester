/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import java.util.Scanner;
public class assmnt_15 {
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter 1st integer:");
        a=input.nextInt();
        System.out.print("Enter 2nd integer:");
        b=input.nextInt();
        System.out.print("Enter 3rd integer:");
        c=input.nextInt();
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
            if ( i%a == 0 && i%b == 0 && i%c == 0) {
                lcm = i;
                break;
            }
        }
        System.out.println("LCM of 3 integers:" + lcm);
    }
}
