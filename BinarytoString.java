package preparation;

	
	import java.util.*;
	 class BinarytoDecimal  {
	 
	
	
	public static void main(String args[])
	 {
		 try
		 {
		Scanner in = new Scanner( System.in );
		 
		 System.out.println("Enter a binary number: ");
		 String binaryString =in.nextLine();
		 
		 System.out.println("Result: "+Integer.parseInt(binaryString,2));
		 }
		 catch(Exception e)
		 {
			 System.err.println(e);
		 }
	 	
	 }
	 }

