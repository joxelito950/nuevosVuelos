package com.tns.techfly.vuelos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="reserva")
public class Reserva {
	@Id
	private long idReserva;
	
	@Column(name="cedula")
	private int cedula;
	
	@Column(name="idvuelo")
	private int idvuelo;

	public Reserva() {
		super();
	}

	public Reserva(int cedula, int idvuelo) {
		this.cedula = cedula;
		this.idvuelo = idvuelo;
	}

	public long getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(long idReserva) {
		this.idReserva = idReserva;
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public int getIdvuelo() {
		return idvuelo;
	}

	public void setIdvuelo(int idvuelo) {
		this.idvuelo = idvuelo;
	}

}
