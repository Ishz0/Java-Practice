import java.util.*;
public class Main
{
	public static void main(String[] args) {
    		
    		int a[]={11,33,22,44,66,77,99,88};
    		for (int i = 0; i < a.length; i++)   
            {  
                for (int j = i + 1; j < a.length; j++)   
                {  
                    int tmp = 0;  
                    if (a[i] > a[j])   
                    {  
                        tmp = a[i];  
                        a[i] = a[j];  
                        a[j] = tmp;  
                    }  
                }  
            System.out.println(a[i]); 
            }

	}
}
