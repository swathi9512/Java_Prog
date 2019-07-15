
public class Mitarbeiter {
	
	public static int laufendeNummer; // KLASSENVARIABLE
	int nummer =1; //laufende Nummer
	String vorname; // vorname der Mitarbeiter
	
	Mitarbeiter (String derVorname){	// Konstruktor
		vorname = derVorname; // Zuweisung der INSTANZVARIABLE
		//nummer = nummer+1; //Erhöhung um jeweils 1
		laufendeNummer=laufendeNummer+1;//Erhöhung der KLASSENVARIABLE um 1
		
	
		System.out.println("Mitarbeiter" +nummer+"heißt"+vorname);
		
	}

}
