package Topic0;

public class Factory {
	
	public final int House=0;
	
	public final int Hospital=1;
	
	//type of the construction(house,hospital...)
	public int Type;
	
	
	//constructor
	public Factory (int Type)
	{
		this.Type=Type;
	}
	
	public Construction myConstruction()
	{
		switch(this.Type)
		{
			
			case House: return new House(1, 0, "Concret", 4, "Tile");
				
			case Hospital: return new Hospital (2, 3, "Concret", 10, "Concret");
		}
		return null;	
			
	}
	
}
