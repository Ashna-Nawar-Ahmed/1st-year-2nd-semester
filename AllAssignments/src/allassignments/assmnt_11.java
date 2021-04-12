/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allassignments;

import java.util.Arrays;
import java.util.Scanner;

public class assmnt_11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, sum = 0, temp, j, n;
        System.out.println("Enter no.of integers:");
        n = input.nextInt();
        int ar[] = new int[n];
        System.out.println("Enter integers:");
        for (i = 0; i < n; i++) {
            if (input.hasNextInt()) {
                ar[i] = input.nextInt();
            }
        }

        double avg, stdDev, max, min, median, mode = 0;
        for (i = 0; i < n; i++) {
            sum += ar[i];
        }
        avg = sum / n;
        System.out.println("Average: " + avg);
        max = ar[0];
        for (i = 0; i < n; i++) {
            if (ar[i] > max) {
                max = ar[i];
            }
        }
        sum = 0;
        for (i = 0; i < n; i++) {
            sum += Math.pow((ar[i] - avg), 2);
        }
        stdDev = Math.pow((sum / n), 0.5);
        System.out.println("Standard deviation: " + stdDev);

        System.out.println("Maximum value: " + max);
        min = ar[0];
        for (i = 0; i < n; i++) {
            if (ar[i] < min) {
                min = ar[i];
            }
        }
        System.out.println("Minimum value: " + min);

        for (j = 0; j < n; j++) {
            for (i = 0; i < n - j - 1; i++) {

                if (ar[i] > ar[i + 1]) {
                    temp = ar[i + 1];
                    ar[i + 1] = ar[i];
                    ar[i] = temp;

                }
            }

        }
        if (n % 2 != 0) {
            median = ar[n / 2];
            System.out.println("Median: " + median);
        } else {
            median = (ar[n / 2] + ar[(n / 2) - 1]) / 2.0;
            System.out.println("Median: " + median);
        }
        int count = 0;
        int modeAr[] = new int[n];
        int currentVal[] = new int[n];
        int k = 0;
        for (i = 0; i < n; i++) {
            count = 1;
            for (j = i + 1; j < n; j++) {
                if (ar[j] == ar[i]) {

                    count++;

                }

            }
            currentVal[k] = ar[i];
            modeAr[k] = count;
            k++;
        }
        int maxMode = modeAr[0];
        for (i = 0; i < n; i++) {
            if (modeAr[i] > maxMode) {
                maxMode = modeAr[i];
                count = i;
            }
        }
        System.out.print("Mode: ");
        if (maxMode > 1) {
            System.out.print(currentVal[count]);
        } else if (maxMode == 1) {
            System.out.print("None");
        }

    }
}
