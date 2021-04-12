/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mid;

/**
 *
 * @author USER
 */
public class quiz2b {

    public static void main(String[] args) {
        IntegerSet obj = new IntegerSet();
        boolean[] z = obj.unionOfSets();
        IntegerSet.insertElement(38);
    }

}

class IntegerSet {

    static boolean[] a, b;

    IntegerSet() {
        a = new boolean[100];
        b = new boolean[100];
    }

    IntegerSet(boolean[] x, boolean[] y) {
        a = x;
        b = y;
    }

    boolean[] unionOfSets() {
        boolean[] c = new boolean[100];
        for (int i = 0; i < c.length; i++) {
            if (a[i] == true || b[i] == true) {
                c[i] = true;
            }
        }
        return c;
    }

    static void insertElement(int k) {
        a[k] = true;
    }
}
