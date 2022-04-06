import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int a[]={11,33,22,44,66,77,99,88};
		for (int i = 0; i < a.length-1; i++)   
        {  
            int tmp=0;
            if (a[i] > a[i+1])   
            {  
                tmp = a[i];  
                a[i] = a[i+1];  
                a[i+1] = tmp;  
            }  
            
        System.out.println(a[i]); 
        }
	}
}
