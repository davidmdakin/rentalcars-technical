package test.java;

import static org.junit.Assert.*;
import org.junit.Test;
import main.java.Car;

public class CarTest {
	@Test
	public final void CarToEx1Output() {
		Car car = new Car("CDMR", "Ford Focus", 157.85f, "Hertz", 8.9f);
		String ex1Output = car.getEx1Output();
		assertEquals(ex1Output, "Ford Focus - 157.85");
	}
	
}
