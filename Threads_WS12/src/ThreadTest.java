import java.lang.*;

public class ThreadTest implements Runnable
{
	int delay;
	int iteration;
	long zeit;
	String word;
	final long START = System.currentTimeMillis();
	
	public ThreadTest (String[] ref)
	{
		delay = Integer.valueOf(ref[0]).intValue();
		iteration = Integer.valueOf(ref[1]).intValue();
		word = ref[2];
	}
	
	public ThreadTest()
	{
		delay = 1000;
		iteration = 5;
		word = "PROBE";
	}
	
	public void run()
	{
		for(int i =1; i<=iteration; i++)
		{
			System.out.println(word + "" + (System.currentTimeMillis()-START));
			try
			{
				Thread.sleep(delay);
				
			}
			catch (InterruptedException ie)
			{
			}
		}
	}
	public static void main (String[] args)
	{
		Thread meinThread = new Thread(new ThreadTest(args));
		Thread testThread = new Thread(new ThreadTest());
		testThread.start();
		meinThread.start();
	}
}




//java ThreadTest 1500 5 Tasktest                                      
//PROBE1
//Tasktest3
//PROBE1002
//Tasktest1504
//PROBE2002
//PROBE3003
//Tasktest3004
//PROBE4003
//Tasktest4504
//Tasktest6005


//java ThreadTest 1500 7 Tasktest
//PROBE1
//Tasktest4
//PROBE1002
//Tasktest1504
//PROBE2002
//PROBE3003
//Tasktest3005
//PROBE4003
//Tasktest4505
//Tasktest6005
//Tasktest7506
//Tasktest9006







