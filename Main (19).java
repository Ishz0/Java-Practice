import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    try {
          FileWriter myWriter = new FileWriter("file1.txt");
          myWriter.write("Java is a Secure and reliable too");
          myWriter.close();
        } catch (IOException e) {
          System.out.println("error");
    }
	File file = new File("file1.txt");
 
        try(FileReader fr=new FileReader(file))
        {
            int content;
            while ((content=fr.read())!=-1) {
                System.out.print((char) content);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
	}
}
