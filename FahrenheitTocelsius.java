import java.util.*;
import static java.lang.System.*;
class FahrenheitTocelsius
{
	public static void main(String[] args) 
	{
	Scanner s = new Scanner(System.in);
     out.println("enter fahrenheit temperature:");
	 int n = s.nextInt();
	 int temp;
	 temp =((n-32)*5)/9;
	 out.println("Temperature in celsius is:"+temp);

	}
}
