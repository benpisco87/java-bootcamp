package shoppingcart;

import javax.persistence.*;
import javax.persistence.Enumerated;


@Entity
@Table(name="User")
public class User {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="id")
	private long id;
	
	@Column(name="userName")
	private String userName;
	
	@Enumerated
	@Column(name="type")
	private userType type;
	
	protected User() {
	}


	public User(String userName, userType type)
	{
		this.userName=userName;
		this.type=type;
	}
	
	
	public long getId() {
		return id;
	}
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public userType getType() {
		return type;
	}
	public void setType(userType type) {
		this.type = type;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
