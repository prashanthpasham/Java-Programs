import java.io.*;
class FileCopy
{
	public static void main(String[] args) 
	{
		try{
		FileInputStream fis = new FileInputStream("kb.jpg");
		int n = fis.available();
		byte b[] = new byte[n];
		fis.read(b);
		FileOutputStream fos = new FileOutputStream("lhj.jpg");
		fos.write(b);
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
