package com.tns.techfly.vuelos.UtilBusiness;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.criteria.CriteriaBuilder.Case;

public class Business {

	public static float COST_WEEK_MORNING = 30000;
	public static float COST_WEEK_LATE = 40000;
	public static float COST_WEEKEND_MORNING = 50000;
	public static float COST_WEEKEND_LATE = 60000;

	public static float calcularCosto(Date fecha) {
		
		Calendar verificar = Calendar.getInstance();
		verificar.setTime(fecha);
		int diaSemana = verificar.get(Calendar.DAY_OF_WEEK);
		int Hora = verificar.get(Calendar.HOUR_OF_DAY);
		if (diaSemana < 5) {
			if (Hora < 12) {
				return COST_WEEK_MORNING;
			} else {
				return COST_WEEK_LATE;
			}

		} else {
			if (Hora > 12) {
				return COST_WEEKEND_LATE;
			} else {
				return COST_WEEKEND_MORNING;
			}

		}

	}
}
