package com.tns.techfly.vuelos.model;


import javax.persistence.*;

import Utils.Utils;
import java.util.Date;


@Entity
@Table(name = "vuelo")

public class Vuelo {
	@Id
	private long idVuelo;
	
	@Column(name="fechasalida")
	private Date fechaSalida;

	@Column(name="costo")
	private float costo;
	
	public Vuelo() {
		super();
	}

	public Vuelo(long id,Date fecha) {
		this.idVuelo=id;
		this.fechaSalida=fecha;
		this.costo=Utils.calcularCosto(fecha);

	}

	public long getIdVuelo() {
		return idVuelo;
	}

	public Date getFechaSalida() {
		return fechaSalida;
	}

	public float getCosto() {
		return costo;
	}

	public void nuevaFechaSalida(Date fechaSalida2) {
		this.fechaSalida=fechaSalida2;
		costo=Utils.calcularCosto(fechaSalida2);
	}
	
	
}
