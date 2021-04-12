/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prevquestion;
import java.util.Scanner;
/**
 *
 * @author Ashna Ahmed
 */
public class fall16_1c {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter integer:");
        int n=0;
        if(input.hasNextInt())
        {
            n=input.nextInt();
            
        }
        int ar[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int i=10,pos=0;
        while(i<=n*10)
        {
           ar[pos]=n%i; 
           if(pos>0)
           {
              ar[pos]=ar[pos]/(i/10); 
           }
           pos++;
           i*=10;
        }
        int max=0;
        for(i=0;i<pos;i++)
        {
            if(ar[i]>max)
            {
                max=ar[i];
            }
        }
        System.out.println("Maximum digit: "+max);
        
    }
}
