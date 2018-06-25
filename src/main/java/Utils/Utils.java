package Utils;

import java.util.Calendar;
import java.util.Date;

public class Utils {

	
	
	public static Date obtenerFecha(int diaSemana,int hora) {
		Calendar fecha=Calendar.getInstance();
		fecha.set(Calendar.HOUR_OF_DAY, hora);
		fecha.set(Calendar.DAY_OF_WEEK, diaSemana);
		Date fechaRetorna = new Date();
		fechaRetorna= fecha.getTime();
		return fechaRetorna;
	}
	
	
}
