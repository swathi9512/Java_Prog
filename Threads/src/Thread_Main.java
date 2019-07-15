
public class Thread_Main {

	public static void main(String[] args) {
		PingPong ping = new PingPong("ping", 33);
		PingPong pong= new PingPong("PONG",100);
		
		ping.start();
		pong.start();

	}

}
