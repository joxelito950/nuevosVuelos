package UtilsTest;


import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import Utils.Utils;

public class UtilsTest {
	
	@Test
	public void verificarMenorEdad() {
		Assert.assertFalse(Utils.esMayorEdad(17));
	}
	
	@Test
	public void verficarMayorEdad() {
		Assert.assertTrue(Utils.esMayorEdad(18));
	}
	
}
