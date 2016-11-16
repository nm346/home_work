
package eMarket.domain;

import java.util.*;
import java.text.SimpleDateFormat;

public class Order {

	public static int lastId = 0;
	private int id = -1;
	private String date;
	private String description;
	private double price;
	public int amount;
	private String name;
	private double cost;

	public Order() {
	}

	public Order(int id, String date, String description, double price) {
		this.setId(id);
		this.setDate(date);
		this.setDescription(description);
		this.setPrice(price);
	}

	public void setCost() {
		cost = amount * price;
	}

	public double getCost() {
		return cost;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setId() {
		id = lastId;
		lastId++;
	}

	public int getId() {
		return id;
	}

	public String getDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String date = sdf.format(new Date());
		return date;
	}

	public void setDate(String date) {
		this.date = date;
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

}
