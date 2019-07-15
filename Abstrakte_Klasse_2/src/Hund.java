public class Hund extends Vierbein
{
	public static int counter = 0;
	
	public Hund(String pName) {
		
		super(pName);
		counter++;
	}
	public void bellen() {
		System.out.println(name +" bellt!");
	}
	public static int getCount() {
		return counter;
	}
}