package UtilsTest;


import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import Utils.Utils;

public class UtilsTest {
	
	@Test
	public void calculaCostoMaņanaSemana() {
		Date maņana= new Date();
		float esperado=Utils.calcularCosto(maņana);
		Assert.assertTrue(30000==esperado);
	}
	
	@Test
	public void calculaCostoTardeSemana() {
		Date maņana= new Date();
		float esperado=Utils.calcularCosto(maņana);
		Assert.assertTrue(40000==esperado);
	}
	
}
