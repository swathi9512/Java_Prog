public class Student3 extends Person2
{
	private int matrikelnummer;
	
	public Student3 (String vorname, String nachname, int matrikelnummer)
	{
		
	// super -> ruft Konstruktuor der Vaterklasse auf: public person2
		super (vorname, nachname);
		this.matrikelnummer = matrikelnummer;
	}
	
	public void print()
	{
		//System.out.println("Nachname:" + nachname);
		//System.out.println("Vorname:" + vorname);
		System.out.println("Matr.Nr:" + matrikelnummer);
	}

}