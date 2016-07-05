import java.util.*;
import static java.lang.System.*;
class Amstrong
{
	public static void main(String[] args) 
	{
	Scanner s = new Scanner(System.in);
     out.println("enter a number to find amstrong:");
	 int n = s.nextInt();
	int temp,r,sum=0;
	temp =n;
	while(temp!=0)
		{
		r = temp%10;
		sum = sum+r*r*r;
		temp = temp/10;
		}
		if(sum == n)
		{
			out.println(n+"is an amstrong number");
		}
		else
		{
        out.println(n+"is not amstrong number");
		}

	}
}
