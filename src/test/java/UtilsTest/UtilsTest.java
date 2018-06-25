package UtilsTest;


import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import Utils.Utils;

public class UtilsTest {
	
	@Test
	public void calculaCostoSemanaMorning() {
		Date mañana= new Date();
		float esperado=Utils.calcularCosto(mañana);
		Assert.assertTrue(30000==esperado);
	}
	
	@Test
	public void calculaCostoSemanaLate() {
		Date mañana= new Date();
		float esperado=Utils.calcularCosto(mañana);
		Assert.assertTrue(40000==esperado);
	}
	
	@Test
	public void calculaCostoFinSemanaLate() {
		Date mañana= new Date();
		float esperado=Utils.calcularCosto(mañana);
		Assert.assertTrue(60000==esperado);
	}
	
	@Test
	public void calculaCostoFinSemanaMorning() {
		Date mañana= new Date();
		float esperado=Utils.calcularCosto(mañana);
		Assert.assertTrue(50000==esperado);
	}
	
}
