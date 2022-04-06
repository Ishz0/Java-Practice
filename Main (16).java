import java.util.*;
class MyException extends Exception {
    public MyException(String s)
    {
        super(s);
    }
}
 
public class Main {
    public static void main(String args[])
    {
        try {
            Scanner s = new Scanner(System.in);
            String a = s.nextLine();
            
            if(a.length()>10)
            {
                throw new MyException("string is too long");
            }
        }
        catch (MyException ex) {
            System.out.println("Caught");
 
            System.out.println(ex.getMessage());
        }
    }
}