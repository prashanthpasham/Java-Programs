import static java.lang.System.*;
import java.util.*;

public class PascalTriangle {

	public static void main(String... args) {
		
		Scanner s = new Scanner(System.in);
		out.println("Enter  no of rows for Pascals Triangle:");
		int rows= s.nextInt();
		
		
		      
		
		        for(int i =0;i<rows;i++) {
		
		            int number = 1;
		
		           System.out.format("%"+(rows-i)*2+"s","");//printing space based on rows
		
		            for(int j=0;j<=i;j++) {
		
		                 System.out.format("%4d",number);
		
		         number = number * (i - j) / (j + 1);
		
		                 
		
		            }
		
		            System.out.println();
		
		        }

		
	}

}
