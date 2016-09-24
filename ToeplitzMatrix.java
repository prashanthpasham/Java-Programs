import static java.lang.System.out;

import java.util.Arrays;
import java.util.Scanner;
public class ToeplitzMatrix
{
	static int n;

	      public static void main(String args[])
	      {
	    	  int m;
	         	Scanner  s = new Scanner(System.in);
	           	out.println("enter the numbers of rows  matrix to check Toeplitz:");
	        	m = Integer.parseInt(s.nextLine());
	        	out.println("enter the numbers of colums matrix to check Toeplitz:");
	        	n = Integer.parseInt(s.nextLine());
	        	int i,j;

	       	int[][] arr=new int[m][n];
		
	          	for(i=0;i<m;i++)
		       {
			        for(j=0;j<n;j++)
			         {
				        out.println("Enter matrix element:\n");
				        int element = s.nextInt();
			            arr[i][j] =	element;
			          }
		       }
	          	out.println("Your Entered Matrix:\n");
	             for(int[] b :arr)
	             {
	            	 out.println(Arrays.toString(b));
	             }
	            	 
	boolean flag = chkToepMat(arr);
	out.print(flag);
	}
public static boolean chkToepMat(int[][] arr)
{
	int i,j;

	
	
		for(j=0;j<=n-1;j++)
		{	
		
				int first = arr[0][0];
                if(arr[j][j]!=first)
                  {
                	return false;
   	               
   	           }     
                   
             
             }
      
			
		return true;
}
}


