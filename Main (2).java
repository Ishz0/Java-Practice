import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		int c;
		
		
		do {
		    
		    System.out.print("enter n1");
		    int s = a.nextInt();
		    System.out.print("enter n1");
		    int d = a.nextInt();
		    
		    int sum;
		    sum = s+d;
		    
		    System.out.println("Your sum is"+sum);
		    System.out.print("Enter 1 to continue");
		    c = a.nextInt();
		} while(c==1);
		
	}
}