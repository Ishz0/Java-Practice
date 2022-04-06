import java.io.File;

public class Main {
   public static long getFileSize(String filename) {
      File file = new File(filename);
      
      return file.length();
   }
   public static void main(String[] args) {
      double size=getFileSize("file1.txt");
      System.out.println("Filesize in bytes: " + size);
      
        double kilobytes=(size/1024);
        double megabytes=(kilobytes/1024);
        double gigabytes=(megabytes/1024);
        
        System.out.println(kilobytes);
        System.out.println(megabytes);
        System.out.println(gigabytes);
   }
}