import java.util.*;
public class LinearSearch {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter an element to search");
	int search = s.nextInt();
	int a[] = {10,20,31,45,54,67,8,9};
	int n =a.length;
	for(int i=0;i<n;i++)
	{
		if(a[i]==search)
		{
			System.out.println("search Element found at:"+i);
		}
	}
	

	}

}
