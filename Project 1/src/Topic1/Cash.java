package Topic1;

public class Cash implements PayStrategy {

	@Override
	public void pay(int total)
	{
		System.out.println("This is the Cash method for the amount of: "+ total);
	}
}
