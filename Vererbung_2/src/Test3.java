public class Test3
{
	public static void main (String[] args)
	{
		Person2 p1 =  new Person2 ("Swathi", "Suthes");
		System.out.println("\nAusgabe der Person:");
		p1.print();
		
		Student2 s1 = new Student2 (" Aha", "ok", 12345);
		System.out.println("\nAusgabe des Studenten: ");
		s1.print();
	}

}


// ‹berschriebene Klassenmethode einer bekannten Basisklasse werden einfach durch
//Angabe des Klassennamens mit ,,Klassenname.methode() aufgerufen