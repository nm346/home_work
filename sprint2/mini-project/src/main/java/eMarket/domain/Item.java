
package eMarket.domain;

public class Item {

	public static int lastId = 0;
	private int id = -1;
	private String name;
	private String description;
	private double price;
	public int amount;
	private int orderId = -1;
	private int productId;

	public Item() {
	}

	public Item(int amount, int orderId, int productId, int parentOrderId) {
		this.setId(id);
		this.setProductId(productId);
		this.setAmount(amount);
		this.setOrderId(parentOrderId);
	}

	public void setProductId(int productId) {
		this.productId = productId;

	}

	public int getProductId() {
		return this.productId;
	}

	public Item(int id, String name, String description, double price) {
		this.setId(id);
		this.setName(name);
		this.setDescription(description);
		this.setPrice(price);
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setOrderId(int id) {
		this.orderId = id++;
	}

	public int getOrderId() {
		return this.orderId;
	}

}
