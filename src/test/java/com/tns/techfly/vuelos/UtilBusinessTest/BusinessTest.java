package com.tns.techfly.vuelos.UtilBusinessTest;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import com.tns.techfly.vuelos.UtilBusiness.Business;


public class BusinessTest {
	@Test
	public void calculaCostoSemanaMorning() {
		Date ma�ana = new Date();
		float esperado =Business.calcularCosto(ma�ana);
		Assert.assertTrue(30000 == esperado);
	}

	@Test
	public void calculaCostoSemanaLate() {
		Date ma�ana = new Date();
		float esperado = Business.calcularCosto(ma�ana);
		Assert.assertTrue(40000 == esperado);
	}

	@Test
	public void calculaCostoFinSemanaLate() {
		Date ma�ana = new Date();
		float esperado = Business.calcularCosto(ma�ana);
		Assert.assertTrue(60000 == esperado);
	}

	@Test
	public void calculaCostoFinSemanaMorning() {
		Date ma�ana = new Date();
		float esperado = Business.calcularCosto(ma�ana);
		Assert.assertTrue(50000 == esperado);
	}

}
