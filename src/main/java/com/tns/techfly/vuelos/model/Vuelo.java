package com.tns.techfly.vuelos.model;

import java.util.Date;

public class Vuelo {
	private int idVuelo;
	private Date fechaSalida;
	
	
	public Vuelo(int id,Date fecha) {
		idVuelo=id;
		fechaSalida=fecha;
	}
}
