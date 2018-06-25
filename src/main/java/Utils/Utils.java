package Utils;

import java.util.Calendar;
import java.util.Date;

public class Utils {

	public static float costSemanaMañana=30000;
	public static float costSemanaTarde=40000;
	
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
		//if(verificar.getWeeksInWeekYear()==1)
		return costSemanaMañana;
	}
	
}
