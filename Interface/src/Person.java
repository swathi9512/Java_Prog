
public class Person implements NachrichtenEmpfaenger{
	
	private String name;
	private String vorname;
	
	public Person (String name, String vorname) // Konstruktor
	{
		this.name = name;
		this.vorname =vorname;
		
	}
	
	// Methode - NachrichtenEmpfänger -- hier wird der Rumpf implementiert
	public void empfangeNachricht (String nachricht)
	{
		System.out.println ("an " + name + " " + vorname + ": "+ nachricht);
	}

	//Methode - NachrichtenEmpfänger -- hier wird der Rumpf implementiert
	@Override
	public boolean anmelden(NachrichtenEmpfaenger empf) {
		// TODO Auto-generated method stub
		return false;
	}

}
