import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Your Full Name: \n");
		String a = s.nextLine();
		
		char[] ch = new char[a.length()];
  
        for (int i = 0; i < a.length(); i++) {
            ch[i] = a.charAt(i);
        }
		
		System.out.print(a.charAt(0));
		for(int i=0;i<ch.length;i++)
		{
		    if (ch[i]==' ')
		    {
		        System.out.print(" "+ch[i+1]);
		    }
		}
	}
}
