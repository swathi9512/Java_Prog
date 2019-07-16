
public class CloneTest {

	public static void main(String[] args) throws CloneNotSupportedException
	{
		Kopie2 ref1 = new Kopie2 (1);
		Kopie2 ref2 = (Kopie2) ref1.clone();							//ref1;
		
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
