import java.util.*;
class BinarySearch {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter size of array");
	int n = s.nextInt();
	int  a[] = new int[n];
	System.out.println("Enter Elements into array");
	for(int i=0;i<a.length;i++)
	{
	a[i] = s.nextInt();
	}
	System.out.println("enter element to search");
	int search = s.nextInt();
	int low = 0;
	int high = n-1;
	int mid = (low+high)/2;
	while(low<=high)
	{
		if(a[mid]<search)
		{
		low = mid+1;
		
		
		}
		else if(a[mid] == search)
		{
			 System.out.println(search + " found at location " + (mid + 1) + ".");
		        break;
		}
       else 
			
		{
			high = mid-1;
			mid = (low+high)/2;
			
		}
		if ( low > high )
		      System.out.println(search + " is not present in the list.\n");
	}

	}

}
