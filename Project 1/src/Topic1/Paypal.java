package Topic1;

public class Paypal implements PayStrategy {

	private String Email;
	private String Password;
	
	public Paypal(String Email, String Password)
	{
		this.Email = Email;
		this.Password = Password;
	}
	
	@Override
	public void pay(int total)
	{
		System.out.println("This is the PayPal method for the amount of: "+ total);
	}
}
