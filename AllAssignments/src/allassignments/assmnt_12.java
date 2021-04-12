/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allassignments;

import java.util.Scanner;
import java.util.Arrays;

       

/**
 *
 * @author USER
 */
public class assmnt_12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int i, j, len,n;
        System.out.println("Enter no.of integers:");
        n = input.nextInt();
        int ar[] = new int[n];
        System.out.println("Enter integers:");
        for (i = 0; i < n; i++) {
            if (input.hasNextInt()) {
                ar[i] = input.nextInt();
            }
        }
        len=ar.length;
        for (i = 0; i < len; i++) {
            for (j = i + 1; j < len;j++) {
                if (ar[j] == ar[i]) {
                    while(j<len-1){
                    ar[j]=ar[j+1];
                    j++;
                    }
                    len--;
                } 
            }
        }
        System.out.println("New array:");
        for(i=0;i<len;i++)
        {
        System.out.println(ar[i]+" ");
        }

    }
}
