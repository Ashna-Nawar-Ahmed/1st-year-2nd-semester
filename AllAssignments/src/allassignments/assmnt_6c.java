/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allassignments;

import java.util.Scanner;

public class assmnt_6c {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("enter the nth prime number to find: ");
        int nthPrime = console.nextInt();
        int prime = 0;
        if (nthPrime <= 0) {
            System.out.println("Wrong Input");
        } else if (nthPrime == 1) {
            System.out.println("Prime value " + 2);
        } else if (nthPrime == 2) {
            System.out.println("Prime value " + 3);
        } else {
            int number = 3;//last prime value i tested
            prime = 2;//identified the first 2 primes.
            // continue testing until prime == nth prime
            while (prime < nthPrime) {
                boolean isFlag = true;
                number += 2;
                int sqrt = (int) Math.sqrt(number);

                for (int i = 3; i <= sqrt; i++) {
                    //isFlag Becomes false only if the number is odd number and not prime.
                    if (number % i == 0) {
                        isFlag = false;

                    }

                }
                //prime value increments if and only if number is prime number
                if (isFlag == true) {
                    prime += 1;
                }

            }
            System.out.println("Prime value " + number);
        }

    }
}
