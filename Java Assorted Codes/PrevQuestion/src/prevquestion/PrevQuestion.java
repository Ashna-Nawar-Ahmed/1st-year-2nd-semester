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
public class PrevQuestion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  throws MyWithdrawException{
        // TODO code application logic here
        Account a=new Account();
        try{
            a.withdrawAmount(1000);
        }finally
        {
            System.out.println("Rest of the code");
        }
    }
    
}
class Account
{
    double balance=100;
   
    boolean withdrawAmount(double amount) throws MyWithdrawException
    {
        if(amount>balance)
            throw new MyWithdrawException();
        return true;
        //else return balance-amount;
    }

}
class MyWithdrawException extends Exception
{
    public String toString()
    {
        return "Withdraw operation fail. You do not have sufficient balance in your account.";
    }
}
