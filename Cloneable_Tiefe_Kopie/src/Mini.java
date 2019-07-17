
public class Mini implements Cloneable
{
	public int x = 1;
	public int y= 1;
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}

class MyClass implements Cloneable
{
	public int var = 1;
	public Mini ref = new Mini();
	
	public Object clone () throws CloneNotSupportedException
	{
		MyClass tmp= (MyClass) super.clone(); // Flache Kopie
		tmp.ref = (Mini) ref.clone(); // Kopierendes Objektes, auf das die Referenz zeigt
		return tmp;
	}
}