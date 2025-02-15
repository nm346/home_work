/**
 * (C) Artur Boronat, 2016
 */
package eMarket.domain;

public class Product {

	public static int lastId = 0;
	private int id = -1;
	private String name;
	private String description;
	private Double price;

	public Product() {
	}

	public Product(int id, String name, String description, Double price) {
		this.setId(id);
		this.setName(name);
		this.setDescription(description);
		this.setPrice(price);
	}

	public void setId() {
		this.id = lastId;
		lastId++;
	}

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
