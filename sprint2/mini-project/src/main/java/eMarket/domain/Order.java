
package eMarket.domain;

import java.util.*;
import java.text.SimpleDateFormat;


public class Order {

	public static int lastId = 0;
    private int id = -1;
    private String date;
    private String description;
    private Double price;
    
    public Order(){}
    
    public Order(int id, String date, String description, Double price) {
		this.setId(id);
		this.setDate(date);
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
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String date = sdf.format(new Date());
		return date;
	}

	public void setDate(String Date) {
		this.date = date;
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
