import java.util.*;

class Account extends Thread
{
    public int bal1,bal2;
    public void display(int b)
    {
        System.out.println("Current balance: "+b);
        try
        {
            Thread.sleep(500);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
    
    public int withdraw(int bal1)
    {
        //bal2=bal2-1000;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter amt u want to withdraw: ");
        int b1=s.nextInt();
        bal1=bal1-b1;
        System.out.println("Balance left:"+bal1);
        try
        {
            Thread.sleep(500);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return bal1;
    }
    
    
    public void deposit(int bal2)
    {
        System.out.println(bal2);
       // this.balnew=bal2+200;
       Scanner sc=new Scanner(System.in);
        System.out.print("Enter amt u want to deposit: ");
        int b2=sc.nextInt();
        bal2 = bal2 + b2;
       // this.bal1=bal2+b2;
        System.out.println("Updated Balance: "+bal2);
        try
        {
            Thread.sleep(500);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

class Details extends Thread
{
    private int bal;
    Account acc;
    Details(int d1, Account obj)
    {
        bal=d1;
        acc=obj;
    }
    public void run()
    {
        synchronized(acc)
        {
            acc.display(bal);
            int u=acc.withdraw(bal);
            acc.deposit(u);
        }
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Account a=new Account();
        Details d=new Details(2000,a);
        d.start();
    }
}

