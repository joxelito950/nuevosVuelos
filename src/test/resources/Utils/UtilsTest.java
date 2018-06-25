package Utils;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UtilsTest {
	
	@Test
	public void calculaCostoMañana() {
		Date mañana= obtenerFecha(9);

	}
	
	public Date obtenerFecha(int hora) {
		Calendar fecha=Calendar.getInstance();
		fecha.set(Calendar.HOUR_OF_DAY, hora);
		Date fechaRetorna = new Date();
		fechaRetorna=fecha.getTime();
		return fechaRetorna;
	}
}
