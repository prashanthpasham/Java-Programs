import java.util.Scanner;
public class StarTriangle {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter a no of rows:");
		int n = s.nextInt();
		
		int i,j,k;
		for(i=1; i<=n; i++)
		{
		for(j=i; j<n; j++)
		{
		System.out.print(" ");
		}
		for(k=1; k<(2*i); k++)
		{
		System.out.print("*");
		}
		System.out.println("");
		}

	}

}
