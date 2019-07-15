import java.io.File;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) {
		try 
		{
			func();
		} //catch (IOException e) {
			//e.printStackTrace();
		//{
		catch (CustomException e) 
		{	
			System.out.println(e.data);
		}
		//func();
	}	
	
	
	public void func() throws IOException, CustomException
	{
		File f = new File("C:\\");
		//f.createNewFile();
		if(ERROR)
		{
			CustomException e = new CustomException();
			e.data = 42;
			throw e;
			//throw new IOException();
		}
	}
		
}
