import static java.lang.System.*;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		String n;
Scanner s = new Scanner(System.in);	
out.println("enter String to check palindrome:\n");
    n = s.nextLine();
    StringBuffer m = new StringBuffer(n);
    StringBuffer z = m.reverse();
    if(n.toString().equals(z.toString()))
    {
    out.println(n+"is a palindrome");
    
    }
    else
    {
    	out.println(n+"is not a palindrome");
    }


	}

}
