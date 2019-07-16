
public class KopieTest 
{
	public static void main (String[] args)
	{
		Kopie ref1 = new Kopie (1);
		Kopie ref2 = ref1;
		
		System.out.println("Wert über ref1: ");
		ref1.print();
		
		System.out.println("Wert über ref2: ");
		ref2.print();
		
		ref1.x = 5;
		
		System.out.println("Wert über ref1: ");
		ref1.print();
		
		System.out.println("Wert über ref2: ");
		ref2.print();
	}

}
