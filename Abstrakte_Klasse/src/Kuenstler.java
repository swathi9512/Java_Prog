
public abstract class Kuenstler
{
	public String name = null;
	
	public Kuenstler(String name)
	{
		this.name = name;
	}
	
	public void vorstellen()
	{
		System.out.println("Hallo ich bin " +name);
	}
	
	// Perfomance is beim Sänger und Tänzer unterschiedlich//
	public abstract void perfomance();
	
	
	public void verbeugen()
	{
		System.out.println("Danke Danke!");
	}
}