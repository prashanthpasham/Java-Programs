import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Largest
{
	public static int n;
	public static void main(String... args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		 n =Integer.parseInt(s.nextLine());
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the array element"+(i+1)+":\n");
			arr[i]=s.nextInt();
		}
		/*System.out.println("Entered Array is:");
		for(int b:arr)
		{
			System.out.println(b);
		}
	*/	
		get3rdLargest(arr);
	}

	public static void get3rdLargest(int[] arr) {
		// TODO Auto-generated method stub
		//System.out.println(arr[n-3]);    
		 System.out.println("Array with distinct elements:");	
		for(int i=0;i<arr.length;i++)
		{
            boolean isDistinct = false;
            for(int j=0;j<i;j++)
            {
                     if(arr[i] == arr[j])
                     {
                       isDistinct = true;
                        break;
                     }
            }
      if(!isDistinct)
      {
               
      Arrays.sort(arr);
           
     System.out.print(arr[i]+" ");
     System.out.println();
     int len = arr.length;
     if(i==len-1)
     {
    	 System.out.println("3rd Largest number is:");
     System.out.println(arr[len-3]);    
     }   
   }
    
}

		

}
}
