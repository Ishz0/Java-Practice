import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("Choose any one between A,B,C,D,F\n");
		
		char b = a.next().charAt(0);
		
		switch(b)
		{
		    case 'A':
		        System.out.println("Excellent");
		        break;
		    case 'B':
		        System.out.println("Very Good");
		        break;
		    case 'C':
		        System.out.println("Good");
		        break;
		    case 'D':
		        System.out.println("Bad");
		        break;
		    case 'F':
		        System.out.println("Failed");
		        break;
		  
		}
	}
}
