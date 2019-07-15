import java.util.Calendar;

public class Turmuhr extends Uhr{
	
	//laeuten Methode wurde aus der Superklasse Uhr überschrieben
	
	
	//@override
	void laeuten(Calendar uhrzeit) {
		for (int i=0; i < uhrzeit.get(Calendar.HOUR);i++) {
			System.out.println(laeutGeraesch);
		}
		System.out.println(uhrzeit.get(Calendar.HOUR_OF_DAY)+":"+uhrzeit.get(Calendar.MINUTE)+":"+uhrzeit.get(Calendar.SECOND)+":"+uhrzeit.get(Calendar.MILLISECOND));
	}

}
