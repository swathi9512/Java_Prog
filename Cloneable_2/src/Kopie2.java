
public class Kopie2 implements Cloneable 
{
	public int x;
	
	public Kopie2 (int x) 
	{
		this.x = x;
	}
	
	public void print()
	{
		System.out.println("x = " + x);
	}
	//�berschreiben der Methode clone() der Klasse Object
	public Object clone() throws CloneNotSupportedException
	{
		//Mit super.clone() wird die �berschriebene Methode clone() der Klasse Object aufgerufen
		return super.clone();
		
	}
}
