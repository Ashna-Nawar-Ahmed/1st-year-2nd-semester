/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prevquestion;

/**
 *
 * @author Ashna Ahmed
 */
public class Test2 {
    int p[]={1,2,3,4,5};
    Test1 t1=new Test1(p);
    Test2(int i){
        t1=new Test1(p);
    }
    public static void main(String args[]){
        Test2 t2=new Test2(5);
    }
}
class Test1{
    Test1(int x[])
    {
        System.out.println("Constructor called.");
        int i=0;
        while(i<4)
        {
            System.out.println(x[i]);
            i=i+2;
        }
    }
}
