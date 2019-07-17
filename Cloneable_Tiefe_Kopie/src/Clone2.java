
public class Clone2 {
	
	public static void main (String[] args) throws CloneNotSupportedException
	{
		MyClass orig = new MyClass();
		MyClass kopie = (MyClass) orig.clone(); // Kopie erstellen
		kopie.var = 2; // Datenfeld der Kopie ändern
		kopie.ref.x = 2; // Datenfeld der Kopie ändern
			
		System.out.println("Original: ");
		System.out.println ("var = " + orig.var);
		System.out.println("Mini.x = " + orig.ref.x + " Mini.y = " + orig.ref.y);
		System.out.println();
		System.out.println("Kopie: ");
		System.out.println("var = " + kopie.var);
		System.out.println("Mini.x = " + kopie.ref.x + " Mini.y = " +kopie.ref.y);
	}
}

