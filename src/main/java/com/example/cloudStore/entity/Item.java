package com.example.cloudStore.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Item {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long ItemId;
	
	@Column(name="name")
	private String Name;
	
	@Column(name="mrp")
	private float mrp;
	
	@Column(name="discountPercent")
	private float discountPercent;
	
	@Column(name="availableQuantity")
	private float availableQuantity;
	
	@Column(name="discountedSellingPrice")
	private float discountedSellingPrice;
	
	@Column(name="weightInGms")
	private float weightInGms;
	
	@Column(name="outOfStock")
	private boolean outOfStock;
	
	
	@Column(name="quantity")
	private float quantity;
	
	


	public Item(String name, float mrp, float discountPercent, float availableQuantity, float discountedSellingPrice,
			float weightInGms, boolean outOfStock, float quantity) {
		super();
		Name = name;
		this.mrp = mrp;
		this.discountPercent = discountPercent;
		this.availableQuantity = availableQuantity;
		this.discountedSellingPrice = discountedSellingPrice;
		this.weightInGms = weightInGms;
		this.outOfStock = outOfStock;
		this.quantity = quantity;
	}
	

	public Item() {
		
	}


	public long getItemId() {
		return ItemId;
	}


	public void setItemId(long itemId) {
		ItemId = itemId;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public float getMrp() {
		return mrp;
	}


	public void setMrp(float mrp) {
		this.mrp = mrp;
	}


	public float getDiscountPercent() {
		return discountPercent;
	}


	public void setDiscountPercent(float discountPercent) {
		this.discountPercent = discountPercent;
	}


	public float getAvailableQuantity() {
		return availableQuantity;
	}


	public void setAvailableQuantity(float availableQuantity) {
		this.availableQuantity = availableQuantity;
	}


	public float getDiscountedSellingPrice() {
		return discountedSellingPrice;
	}


	public void setDiscountedSellingPrice(float discountedSellingPrice) {
		this.discountedSellingPrice = discountedSellingPrice;
	}


	public float getWeightInGms() {
		return weightInGms;
	}


	public void setWeightInGms(float weightInGms) {
		this.weightInGms = weightInGms;
	}


	public boolean isOutOfStock() {
		return outOfStock;
	}


	public void setOutOfStock(boolean outOfStock) {
		this.outOfStock = outOfStock;
	}


	public float getQuantity() {
		return quantity;
	}


	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	
	
	
	
	
	
}

/*"name": "Onion",
"mrp": "2500",
"discountPercent": "16",
"availableQuantity": "3",
"discountedSellingPrice": "2100",
"weightInGms": "1000",
"outOfStock": "FALSE",
"quantity": "1"*/