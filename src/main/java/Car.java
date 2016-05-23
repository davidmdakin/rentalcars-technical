package main.java;

public class Car {
	private String sipp;
	private String name;
	private float price;
	private String supplier;
	private float rating;
	
	public Car(String sipp, String name, float price, String supplier, float rating)
	{
		this.sipp = sipp;
		this.name = name;
		this.price = price;
		this.supplier = supplier;
		this.rating = rating;
	}
	
	public String getSipp()
	{
		return this.sipp;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public float getPrice()
	{
		return this.price;
	}
	
	public String getSupplier()
	{
		return this.supplier;
	}
	
	public float getRating()
	{
		return this.rating;
	}
	
	public String getEx1Output()
	{
		return this.getName() + " - " + this.getPrice();
	}
}
