import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    Vector<String> v= new Vector();
	    v.addElement("Cricket");
	    v.addElement("fb");
	    v.addElement("bb");
	    v.addElement("h");
	    v.addElement("vb");
	    Collections.sort(v);
	    
	    
	    Iterator itr=v.iterator();
	    while(itr.hasNext())
	    {
	        System.out.println(itr.next());
	    }
	}
}
