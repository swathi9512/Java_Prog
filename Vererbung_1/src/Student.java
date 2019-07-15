//KLASSE STUDENT ist UNTERKLASSE von PERSON

public class Student extends Person   // Student wird von Person abgeleitet
{
	
	private int matrikelnummer;			// EIGENES DATENFELD
		
	public void setMatrikelnummer ( int Matrikelnummer) // METHODE der Klasse STUDENT
	{
		this.matrikelnummer = matrikelnummer;
	}

	public void printMatrikelnummer()
	{
		System.out.println ("Matrikelnummer:" + matrikelnummer);
	}
	
}
