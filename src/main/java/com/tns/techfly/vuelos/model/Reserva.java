package com.tns.techfly.vuelos.model;

public class Reserva {

	private long idReserva;
	private int cedula;
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
