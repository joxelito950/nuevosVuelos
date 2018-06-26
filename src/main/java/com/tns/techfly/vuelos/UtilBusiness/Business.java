package com.tns.techfly.vuelos.UtilBusiness;

import static org.mockito.Mockito.RETURNS_DEEP_STUBS;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.criteria.CriteriaBuilder.Case;

public class Business {

	public static float COST_WEEK_MORNING = 30000;
	public static float COST_WEEK_LATE = 40000;
	public static float COST_WEEKEND_MORNING = 50000;
	public static float COST_WEEKEND_LATE = 60000;
	public static int MAYORIA_EDAD = 18;
	public static float precioVuelo;

	public static float calcularCosto(Date fecha) {

		Calendar verificar = Calendar.getInstance();
		verificar.setTime(fecha);
		int diaSemana = verificar.get(Calendar.DAY_OF_WEEK);
		int Hora = verificar.get(Calendar.HOUR_OF_DAY);
		if (horaDelVuelo(Hora)) {
			precioVuelo = vuelosDia(diaSemana);
		} else {
			precioVuelo = vuelosTarde(diaSemana);
		}

		return precioVuelo;

	}

	public static float vuelosDia(int diaSemana) {

		if (diaSemana < 5) {

			return COST_WEEK_MORNING;
		} else {

			return COST_WEEKEND_MORNING;
		}

	}

	public static float vuelosTarde(int diaSemana) {

		if (diaSemana < 5 ) {

			return COST_WEEK_LATE;
		} else {
			return COST_WEEKEND_LATE;
		}

	}

	public static boolean horaDelVuelo(int hora) {

		if (hora < 12) {
			return true;
		} else {
			return false;
		}
	}

	public static Date obtenerFecha(int diaSemana,int hora) {
		Calendar fecha=Calendar.getInstance();
		fecha.set(Calendar.HOUR_OF_DAY, hora);
		fecha.set(Calendar.DAY_OF_WEEK, diaSemana);
		Date fechaRetorna = new Date();
		fechaRetorna= fecha.getTime();
		return fechaRetorna;
	}

	public static boolean esMayorEdad(int edad) {
		return MAYORIA_EDAD<=edad;
	}
}
