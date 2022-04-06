import java.util.*;

public class Main {
    public static void a(int a, int b, int size) throws Exception{
        if(a==0){
            throw new ArithmeticException("err");
        }else if(b>size){
            throw new ArrayIndexOutOfBoundsException("index");
        }
    }
    public static void main(String args[])
    {
        try {
            Scanner s = new Scanner(System.in);
            int w = s.nextInt();
            int e = s.nextInt();
            int size = s.nextInt();
            a(w,e,size);
            
        }
        catch (Exception ex) {
            System.out.println("Caught");
 
            System.out.println(ex.getMessage());
        }
    }
}