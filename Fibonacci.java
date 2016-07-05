import java.util.*;
import static java.lang.System.*;
class Fibonacci
{
	public static void main(String[] args) 
	{
	Scanner s = new Scanner(System.in);
     out.println("enter a number for fibonacci series:");
	 int n = s.nextInt();
	 int sum,n1=0,n2=1;
	 out.println(n1);
	 out.println(n2);
	 for(int i =2;i<=n;i++)
		{
		 sum = n1+n2;
		 out.println(sum);
		 n1 = n2;
		 n2 = sum;
		 
		}

	}
}
