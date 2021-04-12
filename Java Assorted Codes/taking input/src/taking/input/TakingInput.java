/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taking.input;

import java.util.Arrays;
import java.util.Scanner;

public class TakingInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int array[]=new int[5];
        int i;
        System.out.println("Enter 5 integers:");
        for(i=0;i<5;i++)
            array[i]=input.nextInt();
        System.out.println(Arrays.toString(array));
        System.out.println("10>9 is "+(10>9));
    }

}
