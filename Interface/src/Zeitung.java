
public class Zeitung implements NachrichtenQuelle {
	
	private String name;
	private NachrichtenEmpfaenger[] arr;
	private int anzahlEmpfaenger = 0;
	
	public Zeitung (String name, int maxAnzahlEmpfaenger) // Konstruktor
	{
		this.name = name;
		arr = new NachrichtenEmpfaenger [maxAnzahlEmpfaenger];
	}
	
	
	// Methode - NachrichtenEmpfänger -- hier wird der Rumpf implementiert
	public boolean anmelden (NachrichtenEmpfaenger empf) {
		if (anzahlEmpfaenger < arr.length)
		{
			arr[anzahlEmpfaenger++] = empf;
			return true;
		}
		return false;
	}

	//Methode - NachrichtenQuelle --hier wird der Rumpf implementiert
	@Override
	public void sendeNachricht(String nachricht) {
		
		//Alle angemeldeten Nachrichtenempfänger werden benachrichtigt
		
		for (int i=0; i < anzahlEmpfaenger; i++)
		{
			arr [i].empfangeNachricht(nachricht);
		}
		
	}	
	
}
