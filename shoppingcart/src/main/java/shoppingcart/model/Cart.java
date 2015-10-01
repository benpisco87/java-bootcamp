package shoppingcart.model;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name="cart")
public class Cart {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="id")
	private long id;
	
	@OneToOne
	@Column(name="user")
	private User user;
	
	@Column(name="List")
	private List <CartItem> cartItems;
	
	//what is it for and what values it takes?
	//private enum state{value0,value1};
	
	@OneToOne
	@Column(name="payment")
	private Payment payment;
	
	protected Cart() {
	}

	public Cart(long id, User user, List<CartItem> cartItem, Payment payment )
	{
		this.id=id;
		this.user=user;
		this.cartItems=cartItem;
		this.payment=payment;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
}
