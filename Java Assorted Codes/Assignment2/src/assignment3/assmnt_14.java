/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import java.util.Scanner;
public class assmnt_14 {
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter 1st integer:");
        a=input.nextInt();
        System.out.print("Enter 2nd integer:");
        b=input.nextInt();
        System.out.print("Enter 3rd integer:");
        c=input.nextInt();
        int i, gcd = 0,min;
        if(a<b&&a<c)
            min=a;
        else
        {
            if(b<a&&b<c)
                min=b;
            else
                min=c;
        }
        for (i = min; i >= 1; i--) {
            if (a % i == 0 && b % i == 0 && c % i == 0) 
            {
                gcd = i;
                break;
            }
        }
        System.out.println("\nThe GCD of 3 integers:"+gcd);
    }
}
