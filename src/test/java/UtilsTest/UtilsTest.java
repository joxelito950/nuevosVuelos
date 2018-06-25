package UtilsTest;


import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import Utils.Utils;

public class UtilsTest {
	
	@Test
	public void calculaCostoMañanaSemana() {
		Date mañana= new Date();
		float esperado=Utils.calcularCosto(mañana);
		Assert.assertTrue(30000==esperado);
	}
	
	@Test
	public void calculaCostoTardeSemana() {
		Date mañana= new Date();
		float esperado=Utils.calcularCosto(mañana);
		Assert.assertTrue(40000==esperado);
	}
	
}
