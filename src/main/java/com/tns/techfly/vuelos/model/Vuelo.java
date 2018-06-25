package com.tns.techfly.vuelos.model;

import java.util.Date;

import Utils.Utils;

public class Vuelo {
	private int idVuelo;
	private Date fechaSalida;
	private float costo;
	
	
	public Vuelo(int id,Date fecha) {
		idVuelo=id;
		fechaSalida=fecha;
		costo=Utils.calcularCosto(fecha);
	}
}
