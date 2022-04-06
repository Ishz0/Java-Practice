import java.util.*;
import java.time.*;



public class Main
{
	public static void main(String[] args) {
        
        LocalDate today = LocalDate.now();
        LocalDate dob = LocalDate.of(2000, 8, 22);
        
        int s = Period.between(dob, today).getYears();
        int s1 = Period.between(dob, today).getMonths();
        int s2 = Period.between(dob, today).getDays();
        System.out.println("You are "+s+" years "+s1+" months and "+s2+" days old");
	    
	    
	}
}
