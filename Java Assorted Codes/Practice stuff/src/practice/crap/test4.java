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
class test4 {
    public static void main(String args[])
	{
	test3 ob = new test3();
	ob.show();
	}

}
interface test24
{
	int val=33;
	void display();
}
class test2 implements test24
{
	static int val=34;
	public void display()
	{	
	System.out.println(test24.val);
	System.out.println(val);
	}	
} 
class test3 extends test2
{
	int val=35;
	void show()
	{	
	System.out.println(test24.val);
	System.out.println(test2.val);
      System.out.println(val);
	}	
} 

