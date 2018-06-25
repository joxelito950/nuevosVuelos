package com.tns.techfly.vuelos.UtilBusiness;

import java.util.Calendar;
import java.util.Date;

public class Business {

	public static float COST_WEEK_MORNING = 30000;
	public static float COST_WEEK_LATE = 40000;
	public static float COST_WEEKEND_MORNING = 50000;
	public static float COST_WEEKEND_LATE = 60000;

	public static float calcularCosto(Date fecha) {
		Calendar verificar = Calendar.getInstance();
		verificar.setTime(fecha);

		return COST_WEEK_LATE;
	}
}
