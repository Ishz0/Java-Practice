public class Main extends Thread{
  public static int amount=0;

  public static void main(String[] args){
      for(int i=0;i<=10;i++)
      {
    Main t = new Main();
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