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

//java ThreadTest 2000 6 Klausur


//PROBE2
//Klausur4
//PROBE1002
//PROBE2003
//Klausur2004
//PROBE3003
//PROBE4003
//Klausur4004
//Klausur6004
//Klausur8005
//Klausur10005





//java ThreadTest 2000 7  Klausur

//PROBE2
//Klausur4
//PROBE1002
//PROBE2003
//Klausur2004
//PROBE3003
//PROBE4003
//Klausur4004
//Klausur6004
//Klausur8005
//Klausur10005
//Klausur12006





