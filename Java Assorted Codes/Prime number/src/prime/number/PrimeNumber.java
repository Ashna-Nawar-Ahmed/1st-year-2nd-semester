/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime.number;

/**
 *
 * @author USER
 */
public class PrimeNumber {

    
    public static void main(String[] args) {
        int i, n, flag = 1;
        n = 20;
        for (i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                flag = 0;
            }
        }
        if (flag == 1) {
            System.out.println("It is a prime number.");
        } else {
            System.out.println("It is not a prime number.");
        }

    }

}
