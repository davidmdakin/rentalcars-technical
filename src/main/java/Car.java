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
	
	String getSipp1()
	{
		char sipp = this.getSipp().charAt(0);
		switch (sipp)
		{
    	case 'M':
    		return "Mini";
		case 'E':
    		return "Economy";
		case 'C':
    		return "Compact";
		case 'I':
    		return "Intermediate";
		case 'S':
    		return "Standard";
		case 'F':
    		return "Full size";
		case 'P':
    		return "Premium";
		case 'L':
    		return "Luxury";
		case 'X':
    		return "Special";
		default:
			return "Unknown";
		}
	}
	
	String getSipp2()
	{
		char sipp = this.getSipp().charAt(1);
		switch (sipp)
		{
	    	case 'B':
	    		return "2 doors";
	    	case 'C':
	    		return "4 doors";
	    	case 'D':
	    		return "5 doors";
	    	case 'W':
	    		return "Estate";
	    	case 'T':
	    		return "Convertible";
	    	case 'F':
	    		return "SUV";
	    	case 'P':
	    		return "Pick up";
	    	case 'V':
	    		return "Passenger Van";
			default:
				return "Unknown";
    	}
	}
	
	String getSipp3()
	{
		char sipp = this.getSipp().charAt(2);
		switch (sipp)
		{
    	case 'M':
    		return "Manual";
    	case 'A':
    		return "Automatic";
		default:
			return "Unknown";
    	}
	}
	
	String getSipp4()
	{
		char sipp = this.getSipp().charAt(3);
		switch (sipp)
		{
    	case 'N':
    		return "Petrol - No AC";
    	case 'R':
    		return "Petrol - AC";
		default:
			return "Unknown - Unknown";
    	}
	}
	
	public String getEx1Output()
	{
		return this.getName() + " - " + this.getPrice();
	}
	
	public String getEx2Output()
	{
		return this.getName() + " - " + this.getSipp() + " - " + this.getSipp1() + " - " + this.getSipp2() + " - " + this.getSipp3() + " - " + this.getSipp4();
	}
}
