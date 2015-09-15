package Topic1;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	//list of items
	List<Item> items;
	
	
	public ShoppingCart()
	{
		this.items = new ArrayList<Item>();
	}

	public int Total()
	{
		int sum = 0;
		for (Item i : items)
		{
			sum+= i.getPrice();
		}
		
		return sum;
	}
	
	public void addItem(Item item)
	{
		this.items.add(item);
	}
	
	public void removeItem(Item item)
	{
		this.items.remove(item);
	}
	
	//it pay with the indicated method in the args
	public void pay(PayStrategy payMethod)
	{
		int total= this.Total();
		payMethod.pay(total);
	}
}
