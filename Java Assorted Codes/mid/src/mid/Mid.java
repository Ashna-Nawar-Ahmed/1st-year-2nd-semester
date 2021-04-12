
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
public class Mid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyComplex num1 = new MyComplex(1.1, 2.2);
        MyComplex num2 = new MyComplex(3.3, 3.3);
        System.out.println("Number 1 is: " + num1);
        if (num1.isReal()) {
            System.out.println(num1 + " is a pure real number");
        } else {
            System.out.println(num1 + " is not a pure real number");
        }
        if (num1.isImag()) {
            System.out.println(num1 + " is a pure imaginary number");
        } else {
            System.out.println(num1 + " is not a pure imaginary number");
        }
        System.out.println("Number 2 is: " + num2);
        if (num2.isReal()) {
            System.out.println(num2 + " is a pure real number");
        } else {
            System.out.println(num2 + " is not a pure real number");
        }
        if (num2.isImag()) {
            System.out.println(num2 + " is a pure imaginary number");
        } else {
            System.out.println(num2 + " is not a pure imaginary number");
        }

        if (num1.equals(num2.real, num2.imag)) {
            System.out.println(num1 + " is equal to " + num2);
        } else {
            System.out.println(num1 + " is not equal to " + num2);
        }

        System.out.println(num1 + " + " + num2 + "=" + num1.add(num2));
        System.out.println(num1 + " - " + num2 + "=" + num1.subtract(num2));

    }

}

class MyComplex {

    double real, imag;

    public MyComplex() {
    }

    MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public String toString() {
        return "(" + real + " + " + imag + "i)";
    }

    boolean isReal() {
        return imag == 0;
    }

    boolean isImag() {
        return real == 0;
    }

    boolean equals(double real, double imag) {
        return (this.real == real && this.imag == imag);
    }

    double magnetude() {
        return Math.sqrt(real * real + imag * imag);
    }

    double argumentInRadian() {
        return Math.atan2(imag, real);
    }

    double argumentInDegree() {
        return argumentInRadian() * 3.1416 / 180;
    }

    MyComplex conjugate(MyComplex another) {
        another = new MyComplex(this.real, -this.imag);
        return another;
    }

    MyComplex add(MyComplex another) {
        MyComplex result = new MyComplex();
        result.real = this.real + another.real;
        result.imag = this.imag + another.imag;
        return result;
    }

    MyComplex subtract(MyComplex another) {
        MyComplex result = new MyComplex();
        result.real = this.real - another.real;
        result.imag = this.imag - another.imag;
        return result;
    }

}
