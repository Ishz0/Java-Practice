import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    ArrayList<String> list=new ArrayList<String>();
	    System.out.println(list.isEmpty());
	    list.add("C");
	    list.add("C++");
	    list.add("Java");
	    list.add("Kotlin");
	    list.add("Python");
	    list.add("Perl");
	    list.add("Ruby");
	    
	    System.out.println(list);
	    
	    list.remove(5);
	    list.remove("Kotlin");
	    
	    System.out.println(list);
	    
	    ArrayList<String> l=new ArrayList<String>();
        l.add("Python");
        l.add("Ruby");
        
        list.removeAll(l);

        System.out.println(l);
        
        // ArrayList<Integer> f = new ArrayList<Integer>(l);
        // f.removeAll(l);
 
        list.removeIf(n->(n.charAt(0)=='C'));
        System.out.println(list);
	}
}
