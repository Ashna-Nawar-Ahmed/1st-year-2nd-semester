/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allassignments;

import java.util.Scanner;

public class assmnt_4d {

    public static void main(String[] args) {
        int t0 = 0, t1 = 1, tn = 0, i,n;
        boolean flag=false;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter term:");
        n = input.nextInt();
        for (i = 1; i <= n; i++) {
            tn = t0 + t1;
            t0 = t1;
            t1 = tn;
            
            if(n==tn)
                flag=true;
        }
        if(flag)
            System.out.println("It is a Fibonacci number");
        else System.out.println("It is not a Fibonacci number");
    }
}
