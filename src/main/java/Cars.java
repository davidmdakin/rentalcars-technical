package main.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Cars {
	public static void main(String[] args)
	{
		String input = "";
		try {
			input = readFile("C:/vehicles.json");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		if (input.length() > 0)
		{
			ArrayList<Car> carList = JsonStringToCarList(input);
			ArrayList<Car> sortedCarList = SortByPriceAsc(carList);
			for (Car car : sortedCarList)
			{
				System.out.println(car.getEx1Output());
			}
			
			System.out.println("");
			
			for (Car car : carList)
			{
				System.out.println(car.getEx2Output());
			}
		}
	}
	
	public static String readFile(String path) throws IOException 
	{
	  byte[] encoded = Files.readAllBytes(Paths.get(path));
	  return new String(encoded);
	}
	
	public static ArrayList<Car> JsonStringToCarList(String jsonString)
	{
		JsonObject jsonObject = new JsonParser().parse(jsonString).getAsJsonObject();
		JsonArray jsa = jsonObject.get("Search").getAsJsonObject().get("VehicleList").getAsJsonArray();
		
		Gson gson = new Gson();

	    Car[] navigationArray = gson.fromJson(jsa, Car[].class);
	    ArrayList<Car> carList = new ArrayList<Car>();
	    for (Car car : navigationArray)
	    {
	    	carList.add(car);
	    }
	    return carList;
	}
	
	public static ArrayList<Car> SortByPriceAsc(ArrayList<Car> carList)
	{
		Collections.sort(carList, (Car p1, Car p2) -> Float.compare(p1.getPrice(), p2.getPrice()));
		return carList;
	}

}
