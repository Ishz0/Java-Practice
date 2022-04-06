import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    Vector<String> v= new Vector();
	    Vector<String> v1= new Vector();
	    Vector<String> v2= new Vector();
	    v.addElement("Cricket");
	    v.addElement("fb");
	    v.addElement("bb");
	    v.addElement("h");
	   // v.addElement("vb");
	    v1.addElement("vb");
	    v1.addElement("Cricket");
	    v1.addElement("fb");
	    v1.addElement("bb");
	    v1.addElement("h");
	    v2.addElement("vb");
	    v2.addElement("Cricket");
	    v2.addElement("fb");
	    v2.addElement("bb");
	    v2.addElement("h");
	    Collections.sort(v);
	    Collections.sort(v1);
	    Collections.sort(v2);
	    System.out.println(v.containsAll(v2));
	    
	    Iterator itr=v.iterator();
	    while(itr.hasNext())
	    {
	        System.out.println(itr.next());
	    }
	}
}
