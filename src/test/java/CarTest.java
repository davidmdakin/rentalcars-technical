package test.java;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import main.java.Car;
import main.java.Cars;

public class CarTest {
	@Test
	public final void CarToEx1Output()
	{
		Car car = new Car("CDMR", "Ford Focus", 157.85f, "Hertz", 8.9f);
		String ex1Output = car.getEx1Output();
		assertEquals(ex1Output, "Ford Focus - 157.85");
	}
	
	@Test
	public final void CorrectLengthOfCarList()
	{
		String json = "";
		try {
			json = Cars.readFile("C:/vehicles.json");
		}
		catch (Exception e)
		{
			fail("Exception " + e);
		}
		ArrayList<Car> carList = Cars.JsonStringToCarList(json);
		assertEquals(carList.size(), 31);
	}
	
	@Test
	public final void CarListSortedByPriceAsc()
	{
		String json = "";
		try {
			json = Cars.readFile("C:/vehicles.json");
		}
		catch (Exception e)
		{
			fail("Exception " + e);
		}
		ArrayList<Car> carList = Cars.JsonStringToCarList(json);
		carList = Cars.SortByPriceAsc(carList);
		for (int i = 0; i < carList.size() - 1; i++)
		{
			assertTrue(Float.compare(carList.get(i).getPrice(), carList.get(i+1).getPrice()) <= 0);
		}
	}
	
	@Test
	public final void CarToEx2Output()
	{
		Car car = new Car("CDMR", "Ford Focus", 157.85f, "Hertz", 8.9f);
		String ex2Output = car.getEx2Output();
		assertEquals(ex2Output, "Ford Focus - CDMR - Compact - 5 doors - Manual - Petrol - AC");
	}
	
	@Test
	public final void CarToEx3Output()
	{
		Car car = new Car("CDMR", "Ford Focus", 157.85f, "Hertz", 8.9f);
		String ex3Output = car.getEx3Output();
		assertEquals(ex3Output, "Ford Focus - Compact - Hertz - 8.9");
	}
	
	@Test
	public final void CarToEx4Output()
	{
		Car car = new Car("CDMR", "Ford Focus", 157.85f, "Hertz", 8.9f);
		String ex4Output = car.getEx4Output();
		assertEquals(ex4Output, "Ford Focus - 3 - 8.9 - 11.9");
	}
	
	@Test
	public final void carListSortedByCombinedScoreDesc()
	{
		String json = "";
		try {
			json = Cars.readFile("C:/vehicles.json");
		}
		catch (Exception e)
		{
			fail("Exception " + e);
		}
		ArrayList<Car> carList = Cars.JsonStringToCarList(json);
		carList = Cars.SortByCombinedScoreDesc(carList);
		for (int i = 0; i < carList.size() - 1; i++)
		{
			assertTrue(Float.compare(carList.get(i).getCombinedScore(), carList.get(i+1).getCombinedScore()) <= 0);
		}
	}
}
