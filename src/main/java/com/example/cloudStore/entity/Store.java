package com.example.cloudStore.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Store")
public class Store {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long id;
	
	@Column(name="Store_name")
	private String StoreName;
	
	@Column(name="Area")
	private String Area;
	
	@Column(name="Pincode")
	private String Pincode;
	
	@Column(name="Latitude")
	private float Latitude;
	
	@Column(name="Longitude")
	private float Longitude;
	
	

	public Store(String storeName, String area, String pincode, float latitude, float longitude) {
		super();
		StoreName = storeName;
		Area = area;
		Pincode = pincode;
		Latitude = latitude;
		Longitude = longitude;
	}
	
	public Store() {
		
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStoreName() {
		return StoreName;
	}

	public void setStoreName(String storeName) {
		StoreName = storeName;
	}

	public String getArea() {
		return Area;
	}

	public void setArea(String area) {
		Area = area;
	}

	public String getPincode() {
		return Pincode;
	}

	public void setPincode(String pincode) {
		Pincode = pincode;
	}

	public float getLatitude() {
		return Latitude;
	}

	public void setLatitude(float latitude) {
		Latitude = latitude;
	}

	public float getLongitude() {
		return Longitude;
	}

	public void setLongitude(float longitude) {
		Longitude = longitude;
	}
	

}

