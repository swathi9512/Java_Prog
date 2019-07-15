
public abstract class Vierbein
{
	protected String name = null;
	
	public Vierbein() {}
	
		public Vierbein(String pName)
		{
			name = pName;
		}
	
	
	public void rennen()
	{
		System.out.println(name + "rennt!");
	}

}
