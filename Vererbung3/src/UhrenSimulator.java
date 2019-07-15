
import java.util.Calendar;

public class UhrenSimulator {
	
	public static void main(String[] args) {
		
		Uhr uhr1 = new Uhr(); // Objekt der Klasse Uhr
		Uhr uhr2 = new Uhr(); // Noch Objekt der Klasse Uhr
		
		Taschenuhr uhr3 = new Taschenuhr();
		Turmuhr uhr4 = new Turmuhr();
		
		
		//Die Methode benötogt beim Aufruf ein Calender-Objekt
		Calendar cal = Calendar.getInstance(); // Objekt der Klasse Calendar
		
		uhr1.laeutGeraesch = "DING"; //Zuweisung des LAutgeräusches für die erste Uhr
		uhr2.laeutGeraesch ="Piep"; //Zuweisung Wert der Instanzvariablen für Uhr2
		
		uhr3.laeutGeraesch = "TICK-TACK";  // Taschenuhr
		uhr4.laeutGeraesch = "DOOOOONG";		//Turmuhr
		
		
		uhr1.laueten(cal);//Aufruf der Methode für Objekt 1 mit Calendar Objekt
		uhr2.laueten(cal); //Aufruf der Methode für 2 Objek mit dem gleichen Calendar-Objekt
		
		uhr3.laeuten(cal); // Aufruf der Läuten Methode aus der Taschenuhr-Klasse
		uhr4.laeuten(cal); // Aufruf der Läuten Methode für Turmuhren
		
	}

}
