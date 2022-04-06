import java.io.*;
import java.util.*;
class Main {

	public static void main(String args[])
		throws IOException
	{
	    String text;
	    Scanner s = new Scanner(System.in);
	    
	    System.out.println("enter text");
	    text=s.nextLine();
	    
	    FileOutputStream fileOut = new FileOutputStream("file1.txt");
	    fileOut.write(text.getBytes());
	    fileOut.flush();
	    fileOut.close();

		FileInputStream fin = new FileInputStream("file1.txt");

		System.out.println("Number of remaining bytes:"
						+ fin.available());

		System.out.println("FileContents :");

		int ch;

		while ((ch = fin.read()) != -1)
			System.out.print((char)ch);

		fin.close();
	}
}
