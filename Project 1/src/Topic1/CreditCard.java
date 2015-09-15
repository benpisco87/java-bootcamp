package Topic1;

public class CreditCard implements PayStrategy {

	private String Name;
	private int CardId;
	
	public CreditCard(String Name, int CardId)
	{
		this.Name = Name;
		this.CardId = CardId;
	}
	
	@Override
	public void pay(int total)
	{
		System.out.println("This is the CreditCard method for the amount of:"+ total);
	}
}
