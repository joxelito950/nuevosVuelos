package UtilsTest;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import Utils.Utils;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UtilsTest {
	
	@Test
	public void calculaCostoMañanaSemana() {
		Date mañana= Utils.obtenerFecha(9);
		
	}
	
	
}
