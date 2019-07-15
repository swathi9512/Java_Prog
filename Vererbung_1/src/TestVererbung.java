
public class TestVererbung 
{
	public static void main (String[] args)
	{
		
		// Aufruf von der Klasse Student - UNTERKLASSE
		System.out.println ("Student");
		Student studiosus = new Student();
		studiosus.setNachname("Suth");
		studiosus.setVorname("Swathi");
		studiosus.setMatrikelnummer(56123); // Warum 0 ??
		studiosus.print();
		studiosus.printMatrikelnummer();
		
		// Aufruf von der Klasse Person - BASISKLASSE
		System.out.println ("Person");
		Person pers = new Person();
		pers.setNachname ("KP");
		pers.setVorname("MirEgal");
		pers.print();
	}

}