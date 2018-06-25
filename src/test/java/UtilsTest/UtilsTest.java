package UtilsTest;


import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import Utils.Utils;

public class UtilsTest {
	
	@Test
	public void calculaCostoSemanaMorning() {
		Date ma�ana= new Date();
		float esperado=Utils.calcularCosto(ma�ana);
		Assert.assertTrue(30000==esperado);
	}
	
	@Test
	public void calculaCostoSemanaLate() {
		Date ma�ana= new Date();
		float esperado=Utils.calcularCosto(ma�ana);
		Assert.assertTrue(40000==esperado);
	}
	
	@Test
	public void calculaCostoFinSemanaLate() {
		Date ma�ana= new Date();
		float esperado=Utils.calcularCosto(ma�ana);
		Assert.assertTrue(60000==esperado);
	}
	
	@Test
	public void calculaCostoFinSemanaMorning() {
		Date ma�ana= new Date();
		float esperado=Utils.calcularCosto(ma�ana);
		Assert.assertTrue(50000==esperado);
	}
	
}
