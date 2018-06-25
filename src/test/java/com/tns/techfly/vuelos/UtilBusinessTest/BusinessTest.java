package com.tns.techfly.vuelos.UtilBusinessTest;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import com.tns.techfly.vuelos.UtilBusiness.Business;

import Utils.Utils;


public class BusinessTest {
	@Test
	public void calculaCostoSemanaMorning() {
		Date mañana = Utils.obtenerFecha(4, 8); 
		float esperado =Business.calcularCosto(mañana);
		Assert.assertTrue(30000 == esperado);
	}

	@Test
	public void calculaCostoSemanaLate() {
		Date mañana = Utils.obtenerFecha(4, 14); 
		float esperado = Business.calcularCosto(mañana);
		Assert.assertTrue(40000 == esperado);
	}

	@Test
	public void calculaCostoFinSemanaLate() {
		Date mañana =  Utils.obtenerFecha(6, 14); 
		float esperado = Business.calcularCosto(mañana);
		Assert.assertTrue(60000 == esperado);
	}

	@Test
	public void calculaCostoFinSemanaMorning() {
		Date mañana =  Utils.obtenerFecha(6, 4); 
		float esperado = Business.calcularCosto(mañana);
		Assert.assertTrue(50000 == esperado);
	}

}
