/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.crap;

/**
 *
 * @author USER
 */
public class randomShit {

    public static void main(String[] args) {
        char chars[] = {'a', 'b', 'c', 'd', 'e', 'f'};
        String s = new String(chars);
        System.out.println(s);
        String s1 = new String(chars, 2, 3);
        System.out.println(s1);
        String s2 = new String(chars);
        String s3 = new String(s2);
        System.out.println(s2);
        System.out.println(s3);
        byte ascii[] = {65, 66, 67, 68, 69, 70};
        String s4 = new String(ascii);
        System.out.println(s4);
        String s5 = new String(ascii, 2, 3);
        System.out.println(s5);
    }
}
