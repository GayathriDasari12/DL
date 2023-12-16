package Day14.hibernetdemo;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

//DB

@Entity 
@Table
@Cacheable	
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Product {
   
	
	@Id
	@Column
	private int id;
	
	@Column
	private String name;
	@Column
	private String seller;
	@Column
	private int price;
	@Column
	private String imageUrl;
	
	// this is obj rel mapping. we are doing it through annotations.
	
	//rc source  generate getters and setters
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSeller() {
		return seller;
	}
	public void setSeller(String seller) {
		this.seller = seller;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	
	
	
	
	
}
