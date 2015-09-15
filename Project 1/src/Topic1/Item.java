package Topic1;

public class Item {
	
	private String NameCode;
	private int Price;
	
	
	//create a Item with the NameCode and Price
	public Item (String NameCode, int Price)
	{
		this.NameCode = NameCode;
		this.Price = Price;
		
	}

	public String getNameCode()
	{
		return this.NameCode;
	}
	
	public int getPrice()
	{
		return this.Price;
	}
}
