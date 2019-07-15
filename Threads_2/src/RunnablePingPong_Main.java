
public class RunnablePingPong_Main {

	public static void main(String[] args) {
		
		Runnable r1 = new RunnablePingPong("ping",33);
		Runnable r2 = new RunnablePingPong("PONG",100);
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		r1.start();
		r2.start();

	}

}
