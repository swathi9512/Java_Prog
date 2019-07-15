
public class RunnablePingPong {
	
	String word; //auszugebendes Wort
	int delay; //Wartezeit
	
	RunnablePingPong(String whatToSay, int delayTime){
		word =whatToSay;
		delay = delayTime;
	}
	public void run() {
		try {
			for(int i=0; i<20; ++1) {
				System.out.println(word + "");
				Thread.sleep(delay); //warten !static Thread
				
			}
		} catch (InterruptedException e) {return;}
	}
}
