import static java.lang.System.*;
import java.util.*;

public class pal {

	public static void main(String... args) {
		
		Scanner s = new Scanner(System.in);
		out.println("Enter  to check palindrome");
		String z = s.next();
		
		String reverse="";
		int n = z.length();
	
		for(int i=n-1;i>=0;i--)
		{
			reverse = reverse+z.charAt(i);
		}
	
		

		if(z.equals(reverse))
		{
			out.println("palindrome");
		}
		else
		{
			out.println("not palindrome");
		}
		
	}

}
