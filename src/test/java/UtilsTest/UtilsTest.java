package UtilsTest;


import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import Utils.Utils;

public class UtilsTest {
	
	@Test
	public void calculaCostoMa�anaSemana() {
		Date ma�ana= new Date();
		float esperado=Utils.calcularCosto(ma�ana);
		Assert.assertTrue(30000==esperado);
	}
	
	@Test
	public void calculaCostoTardeSemana() {
		Date ma�ana= new Date();
		float esperado=Utils.calcularCosto(ma�ana);
		Assert.assertTrue(40000==esperado);
	}
	
}
