import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    ArrayList<String> list=new ArrayList<String>();
	    list.add("OOPs");
	    
	    Stack<Integer> s=new Stack<>();
	    
	    if(s.isEmpty()){
	        System.out.println("Empty");
	    }
	    s.push(10);
	    s.push(20);
	    s.push(30);
	    s.push(40);
	    
	    System.out.println(s);
	    
	    s.pop();
	    System.out.println(s);
	    
	    int q=s.search(10);
	    System.out.println(q);
	    
	    System.out.println(s.isEmpty());
	    
	    Iterator itr=list.iterator();
	    while(itr.hasNext())
	    {
	        System.out.println(itr.next());
	    }
	}
}
