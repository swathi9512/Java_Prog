
public class PingPong extends Thread{
	
	String word;
	int delay;
	
	PingPong(String whatToSay, int delayTime){
		word=whatToSay;
		delay=delayTime;
	}
	
	public void run() {
		try {
			for(;;) {
				System.out.println(word + "");
				Thread.sleep(delay);//warten
			}
		} catch (InterruptedException e) {return;}
	}
}