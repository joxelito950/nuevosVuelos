package com.tns.techfly.vuelos.model;


import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;

import Utils.Utils;
import java.util.Date;


@Entity
@Table(name = "vuelo")
@EntityListeners(AuditingEntityListener.class)

public class Vuelo {
	@Id
	private String idVuelo;
	
	@Column
	private Date fechaSalida;

	@Column
	private float costo;
	
	public Vuelo(String id,Date fecha) {
		this.idVuelo=id;
		this.fechaSalida=fecha;
		this.costo=Utils.calcularCosto(fecha);

	}
}
