/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcd;

/**
 *
 * @author USER
 */
public class GCD {

    public static void main(String args[]) {
        int a = 144, b = 12, c = 6;
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
        System.out.print("\nThe GCD is :"+gcd);
    }

}