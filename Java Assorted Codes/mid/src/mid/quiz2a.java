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
public class quiz2a {

    public static void main(String[] args) {
        MyFraction f1 = new MyFraction(1, 2);
        MyFraction f2 = new MyFraction(3, 4);
        MyFraction f3 = f2.addition(f1);
    }

}

class MyFraction {

    int a, b;

    MyFraction() {
        a = 0;
        b = 1;
    }

    MyFraction(int x, int y) {
        a = x;
        b = y;
    }

    MyFraction addition(MyFraction x) {
        return new MyFraction((a * x.b + b * x.a), (b * x.b));
    }

    static MyFraction multiplication(MyFraction x, MyFraction y) {
        return new MyFraction((x.a * y.a), (x.b * y.b));
    }
}
