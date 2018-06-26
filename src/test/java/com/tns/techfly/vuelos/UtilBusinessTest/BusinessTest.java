package com.tns.techfly.vuelos.UtilBusinessTest;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import com.tns.techfly.vuelos.UtilBusiness.Business;



public class BusinessTest {
	@Test
	public void calculaCostoSemanaMorning() {
		Date mañana = Business.obtenerFecha(4, 8); 
		float esperado =Business.calcularCosto(mañana);
		Assert.assertTrue(30000 == esperado);
	}
  
	@Test
	public void calculaCostoSemanaLate() {
		Date mañana = Business.obtenerFecha(4, 14); 
		float esperado = Business.calcularCosto(mañana);
		Assert.assertTrue(40000 == esperado);
	}

	@Test
	public void calculaCostoFinSemanaLate() {
		Date mañana =  Business.obtenerFecha(6, 14); 
		float esperado = Business.calcularCosto(mañana);
		Assert.assertTrue(60000 == esperado);
	}

	@Test
	public void calculaCostoFinSemanaMorning() {
		Date mañana =  Business.obtenerFecha(6, 4); 
		float esperado = Business.calcularCosto(mañana);
		Assert.assertTrue(50000 == esperado);
	}
	
	@Test
	public void verificarMenorEdad() {
		Assert.assertFalse(Business.esMayorEdad(17));
	}
	
	@Test
	public void verficarMayorEdad() {
		Assert.assertTrue(Business.esMayorEdad(18));
	}

}
