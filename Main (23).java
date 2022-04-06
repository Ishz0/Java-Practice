import java.io.*;

public class Main implements Runnable{
  public static int amount=0;

  public static void main(String[] args){
      
      
    Main t1 = new Main();
    Thread t2 = new Thread(t1);
    Thread t3 = new Thread(t1);
    Thread t4 = new Thread(t1);
    t2.start();
      System.out.println(t2.isAlive());
      System.out.println(t3.isAlive());
    try{
        t2.join();
    }
    catch(InterruptedException e){
        System.out.println(e);
    }
    t3.start();
    try{
        t3.join();
    }
    catch(InterruptedException e){
        System.out.println(e);
    }
    t4.start();
      System.out.println(t4.isAlive());
    try{
        t4.join();
    }
    catch(InterruptedException e){
        System.out.println(e);
    }
      
      System.out.println(amount);
  }
  public void run()
  {
      System.out.println(Thread.currentThread().getId());
    amount++;
    try{
    Thread.sleep(500);
    }
    catch(InterruptedException ie){}
  }
}