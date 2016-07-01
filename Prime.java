package preparation;
import java.util.*;
public class Prime {

	public static void main(String[] args) {
		int c ;
		Scanner s = new Scanner(System.in);
		System.out.println("enter no to check prime");
		int n = s.nextInt();
		
		for(c=2;c<=n;c++)
		{
			for(int i=2;i<=c;i++)
			{
		
		 if(i==c)
		{
		System.out.println(i+"is  a prime number");	
		}
		
			
		 if(c%i==0)
			{
				break;
			}
			}
		}
	}

}
