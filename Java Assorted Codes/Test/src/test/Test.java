/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Ashna Ahmed
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Book B = new Book();
        Dictionary D = new Dictionary();
        Novel N = new Novel();
        Book R;
        R = B;
        R.message();
        R = D;
        R.message();
        R = N;
        R.message();

    }

}

class Book {

    protected int pages = 1200;

    public void message() {
        System.out.println("Number of pages: " + pages);
    }
}

class Dictionary extends Book {

    protected int definitions = 52500;

    public void message() {
        System.out.println("Number of definitions" + definitions);
    }
}

class Novel extends Dictionary {

    protected int price = 525;

    public void message() {
        System.out.println("Price" + price);
    }
}
