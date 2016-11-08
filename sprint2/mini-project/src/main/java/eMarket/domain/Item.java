
package eMarket.domain;


public class Item {

	public static int lastId = 0;
    private int id = -1;
    private String Date;
    private String description;
    private Double price;
    
    public Item(){}
    
    public Item(int id, String Date, String description, Double price) {
		this.setId(id);
		this.setDate(Date);
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

	public String getDate() {
		return Date;
	}

	public void setDate(String Date) {
		this.Date = Date;
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
