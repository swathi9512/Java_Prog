
import java.util.Calendar;

public class Uhr {
	String laeutGeraesch; // Klingelton der Uhr
	//Calendar uhrZeit= Calendar.getInstance(); //Objek der Klasse Calendar

void laueten (Calendar uhrzeit) {
	System.out.println(laeutGeraesch);
	System.out.println(uhrzeit.get(Calendar.HOUR_OF_DAY)+":"+uhrzeit.get(Calendar.MINUTE)+":"+uhrzeit.get(Calendar.SECOND)+":"+uhrzeit.get(Calendar.MILLISECOND));
}

void laeuten(Calendar uhrzeit, boolean mehrMalsLaueten) {
	
}
	
//void gibZeit(Calendar uhrzeit) {
	//System.out.println(uhrzeit.get(Calendar.HOUR_OF_DAY)+":"+uhrzeit.get(Calendar.MINUTE));
//}	
}
