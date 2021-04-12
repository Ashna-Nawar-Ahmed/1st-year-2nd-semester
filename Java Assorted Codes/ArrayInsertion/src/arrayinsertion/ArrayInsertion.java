/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayinsertion;

public class ArrayInsertion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ar[] = new int[4];
        int i;
        int x = 35, pos = 2;
        int arr[] = new int[5];
        arr[pos] = x;
        for (i = 3; i >= pos; i--) {
            arr[i + 1] = ar[i];
        }
        for (i = 0; i < pos; i++) {
            arr[i] = ar[i];
        }
        for (i = 0; i < 5; i++) {
            System.out.println(arr[i] + " ");
        }
    }

}
