import java.io.File;
import java.io.IOException;

public class Exception_Main
{
	public static void main(String[] args)
	{
		File f = new File("C:\\");
		
	try 
	{
		f.createNewFile();
		
	}
	catch (IOException e) 
	{
		e.printStackTrace();
		
	}
	catch (NullPointerException e)
	{
		
	}
	finally 
	{
		System.out.println("Could not create file");
		System.exit(0);
	}
}
}