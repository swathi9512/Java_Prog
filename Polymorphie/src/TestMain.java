
public class TestMain
{
	public static void main (String[] args)
	{
		//Sortieren von Personen
		
		Person[] refPersonen = new Person [3];
		
		refPersonen[0] = new Person("Müller", "Max");
		refPersonen[1] = new Person("Auer", "Ulrike");
		refPersonen[2] = new Person("Zink", "Mareike");
		
								// Utiliy SortByName
		Utility.sortByName(refPersonen);
		System.out.println("Sortiertes Array mit Personen:");
		Utility.print(refPersonen);
		
		//Sortieren von Studenten
		Student[] refStudenten = new Student[3];
		
		refStudenten[0] = new Student ("Wunder", "Emanuel", 14678);
		refStudenten[1] = new Student ("Maier", "Sabrinna", 15647);
		refStudenten[2] = new Student ("Binder", "Katharina",14578);
		
								//Utiliy.SortByName
		Utility.sortByName(refStudenten);
		System.out.println("\n Sortiertes Array mit Studenten: ");
		Utility.print(refStudenten);
		
		
	}
}