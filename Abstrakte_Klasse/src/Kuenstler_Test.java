
public class Kuenstler_Test
{
	public static void main (String[] args)
	{
		Kuenstler k = new Saenger("Kausi");
		Kuenstler k2 = new Taenzer("Swathi");
		
		k.vorstellen();
		k.perfomance();
		k.verbeugen();
		
		k2.vorstellen();
		k2.perfomance();
		k2.verbeugen();
	}

}
