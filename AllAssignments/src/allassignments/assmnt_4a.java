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
public class assmnt_4a {
   public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        int t0 = 0, t1 = 1, tn=0, i, n;
        System.out.println("Enter n:");
        n = input.nextInt();
       
        System.out.println("First n Fibonacci numbers are:");
        System.out.println("1");
        for (i = 2; i <= n; i++) {
            tn = t0 + t1;
            t0 = t1;
            t1 = tn;
            System.out.println(tn);
        }
    }
 
}
