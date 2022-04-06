public class Main implements Runnable{
  public static int amount=0;

  public static void main(String[] args){
      
      for (int i=0;i<=10;i++)
      {
    Main t1 = new Main();
    Thread t = new Thread(t1);
    t.start();
      }
      System.out.println(amount);
  }
  public void run()
  {
    amount++;
    System.out.println("runnung thread "+ Thread.currentThread().getId());
  }
}