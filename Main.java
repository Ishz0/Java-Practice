import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);
        
        System.out.print("enter enroll id\n");
        int s = a.nextInt();
        
        System.out.print("enter name of student\n");
        String b = a.next();
        
        
        System.out.print("enter Maths marks\n");
        int m1 = a.nextInt();
        
        System.out.print("enter SCience marks\n");
        int m2 = a.nextInt();
        
        
        System.out.print("enter Chemistry marks\n");
        int m3 = a.nextInt();
        
        int avg = (m1+m2+m3)/3;
        System.out.println(b);
        System.out.println(s);
        System.out.println("Avg Marks are:"+avg);
    }
}