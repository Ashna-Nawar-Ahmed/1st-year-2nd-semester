/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.crap;

import java.util.Scanner;
public class PracticeCrap1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=0,b=0,c=0,d=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a & b of 1st complex number a+bi:");
        if(input.hasNextInt())
        {
        a=input.nextInt();
        b=input.nextInt();
        }
        System.out.println("Enter a & b of 2nd complex number a+bi:");
        if(input.hasNextInt())
        {
        c=input.nextInt();
        d=input.nextInt();
        }
        ComplexNum c1=new ComplexNum(a,b,c,d);
        String s1=c1.sum();
        String s2=c1.difference();
        System.out.println("Sum is:"+s1);
        System.out.println("Difference is:"+s2);
    }
    
}
class ComplexNum
{
    int x,y,m,n,sum1,sum2,diff1,diff2;
    ComplexNum(int x,int y,int m,int n)
    {
        this.x=x;
        this.y=y;
        this.m=m;
        this.n=n;
        
    }
    String sum()
    {
    sum1=this.x+this.m;
    sum2=this.y+this.n;
    return sum1+"+"+sum2+"i";
    }
    String difference()
    {
    diff1=this.x-this.m;
    diff2=this.y-this.n;
    return diff1+"+"+diff2+"i";
    }
}
