
public class Test {
	
	public static void main (String [] args)
	{
		Person p1 = new Person ("Fischer", "Fritz"); // anlegen neuer Objekte
		Person p2 = new Person ("Maier", "Hans"); 	// anlegen neuer Objekte
		Person p3 = new Person ("Kunter", "Max");	// anlegen neuer Objekte
		
		Zeitung z1 = new Zeitung ("-Frankfurter Allgemeine-",10);  // anlegen neuer Objekte
		
		// Anmelde Methode von NachrichtenEmpf�nger 
		z1.anmelden(p1);
		z1.anmelden(p2);
		
		Zeitung z2 = new Zeitung ("-S�dkurier-", 10);
		
		z2.anmelden(p1);
		z2.anmelden(p2);
		
		System.out.println("Frankfurter Allgemeine Schlagzeile: ");
		// Sende Nachricht Methode von NachrichtenQuelle
		z1.sendeNachricht("Neues Haushaltsloch von 20 Mrd.EURO");
		
		System.out.println(""); // Absatz
		
		System.out.println("S�dkurier Schlagzeile:");
		// Sende Nachricht Methode von NachrichtenQuelle
		z2.sendeNachricht("Bayern M�nchen Deutscher Meister");
	
	}

}
