package Utils;

import java.util.Calendar;
import java.util.Date;

public class Utils {

	public static float COST_WEEK_MORNING=30000;
	public static float COST_WEEK_LATE=40000;
	public static float COST_WEEKEND_MORNING=50000;
	public static float COST_WEEKEND_LATE=60000;
	
	public static Date obtenerFecha(int diaSemana,int hora) {
		Calendar fecha=Calendar.getInstance();
		fecha.set(Calendar.HOUR_OF_DAY, hora);
		fecha.set(Calendar.DAY_OF_WEEK, diaSemana);
		Date fechaRetorna = new Date();
		fechaRetorna= fecha.getTime();
		return fechaRetorna;
	}
	
	public static float calcularCosto(Date fecha) {
		Calendar verificar=Calendar.getInstance();
		verificar.setTime(fecha);
		
		return COST_WEEK_LATE;
	}
	
}
