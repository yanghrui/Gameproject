import java.util.ArrayList;

public class Alipay
	{
//fields
	private String item; 
	private double price;
	private int quality;
	private String location;
	static ArrayList alipayAL;
	
	public Alipay(String i, double p, int q, String l)
		{
		item = i; 
		price = p;
		quality = q;
		location = l;
		//constructor
		}

//getter and setter
	public String getItem()
		{
		return item;
		}


	public void setObject(String object)
		{
		this.item = item;
		}


	public double getPrice()
		{
		return price;
		}


	public void setPrice(double price)
		{
		this.price = price;
		}


	public int getQuality()
		{
		return quality;
		}


	public void setQuality(int quality)
		{
		this.quality = quality;
		}


	public String getLocation()
		{
		return location;
		}


	public void setLocation(String location)
		{
		this.location = location;
		}


	public static ArrayList<Double> getEbayAL()
		{
		return alipayAL;
		}


	public static void setEbayAL(ArrayList<Double> ebayAL)
		{
		Alipay.alipayAL = ebayAL;
		}
	}
