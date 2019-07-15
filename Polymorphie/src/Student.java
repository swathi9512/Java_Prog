public class Student extends Person
{
	private int matrikelnummer;
	
	public Student (String nachname, String vorname, int matrikelnummer)
	{
		super(nachname, vorname);
		this.matrikelnummer = matrikelnummer;
	}
		// weitere studentenspezfische Methoden
}
