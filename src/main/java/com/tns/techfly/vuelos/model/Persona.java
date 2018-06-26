package com.tns.techfly.vuelos.model;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "persona")
public class Persona {

	@Id
	private long cedula;

	@Column(name = "nombre")
	private String nombre;
	@Column(name = "apellido")
	private String apellido;
	@Column(name = "fechanacimiento")
	private Date fechaNacimiento;
	@Column(name = "celular")
	private int celular;

	public Persona() {
		super();
	}

	public Persona(int cedula, String nombre, String apellido, Date fechaNacimiento, int celular) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.celular = celular;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public int getEdad() {
		Calendar añoActual = Calendar.getInstance();
		Calendar añoNacimiento = Calendar.getInstance();
		añoNacimiento.setTime(fechaNacimiento);
		return añoActual.get(Calendar.YEAR)-añoNacimiento.get(Calendar.YEAR);
	}
	
	public void setEdad(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getCelular() {
		return celular;
	}

	public void setCelular(int celular) {
		this.celular = celular;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

}
