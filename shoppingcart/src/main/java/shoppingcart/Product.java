package shoppingcart;

import javax.persistence.*;

@Entity
@Table(name="product")
public class Product {
	
	
	@Id
	@Column(name="id")
	private long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	@Column(name="imageUrl")
	private String imageUrl;
	
	@Column(name="price")
	private double price;
	
	@Column(name="user")
	@OneToOne
	private User user;
	
	/* What are the value of TYPE and what is it for?
	@Column(name="type")
	private enum type;
	*/
	
	public Product(long id,String name,String description,String imageUrl,double price,User user)
	{
		this.id=id;
		this.name=name;
		this.description=description;
		this.imageUrl=imageUrl;
		this.price=price;
		this.user=user;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
