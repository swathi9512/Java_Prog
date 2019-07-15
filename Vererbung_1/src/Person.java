
// KLASSE PERSON ist BASISKLASSE
public class Person {
	
	private String nachname;     // DATENFELDER
	private String vorname;		//DATENFELDER
	
	public void setNachname (String nachname)  //METHODE
	{
		this.nachname = nachname;
	}
	
	public void setVorname (String vorname) //METHODE
	{
		this.vorname = vorname;
	}
	
	public void print()				//METHODE
	{
		System.out.println( "Nachname:" + nachname);
		System.out.println("Vorname:" + vorname);
	}
}

