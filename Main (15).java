import java.util.*;


public class Main{  
    
public static int m(int n1, int n2)
{
    if(n1==0 || n2==0)
      {
          throw new ArithmeticException();
      }
      else
      {
          return n1*n2;
      }
}
  public static void main(String args[]){ 
      
  try
  {  
      Scanner s = new Scanner(System.in);
      int a = s.nextInt();
      int b = s.nextInt();
      
      int ans = m(a,b);
      System.out.println(ans);
  }
  catch(ArithmeticException e1)
  {
      System.out.println(e1);
       
  }  
}  
}