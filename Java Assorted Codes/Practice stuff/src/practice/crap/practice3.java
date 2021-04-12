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
class test1
{
public static void main(String args[])
{
	System.out.println(test.a);
	test ob1 = new test();
	test ob2 = new test();
	System.out.println(ob1.a);
	System.out.println(ob2.a);
	ob1.a =25;
	System.out.println(ob1.a);
	System.out.println(ob2.a);
}
}
class test{
	static int a = 20;
}

