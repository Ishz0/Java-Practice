import java.util.*;




public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    System.out.print("Enter number");
	    int a = s.nextInt();
	    
	    String str=String.valueOf(a);
	    System.out.println(str+10);
	    
	    Float fOb = new Float(str);
        float f = fOb.floatValue();
        System.out.println(f+10.0);
	    
	    
	}
}
