import java.util.Calendar;

public class Taschenuhr extends Uhr {
	
	//lauten-Methode wurde aus der Superklasse Uhr überschireben
	
	//@override
	void laeuten(Calendar uhrzeit) {
		System.out.println(laeutGeraesch);
		System.out.println(uhrzeit.get(Calendar.HOUR_OF_DAY)+":"+uhrzeit.get(Calendar.MINUTE)+":"+uhrzeit.get(Calendar.SECOND)+":"+uhrzeit.get(Calendar.MILLISECOND));
	}

}
