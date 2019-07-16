
interface NachrichtenQuelle
{
	public int SPROT = 0;
	public int POLITIK = 1;
	public int KULTUR = 2;
	public int ANZEIGEN = 3;
	public int GESAMT = 4;
	
	public boolean anmelden(NachrichtenEmpfaenger empf, int type);
	public void sendeNachricht (String nachricht);
}

interface NachrichtenEmpfaenger
{
	public void empfangeNachricht (String nachricht);
}

interface Vermittler extends NachrichtenQuelle, NachrichtenEmpfaenger
{
	
}
