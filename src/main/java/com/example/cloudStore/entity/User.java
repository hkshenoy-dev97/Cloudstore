package com.example.cloudStore.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long userId;
	
	@Column(name="email")
	private String email;
	
	
	@Column(name="password")
	private String password;
	
	@Column(name="Area")
	private String Area;
	
	@Column(name="Address")
	private String Address;
	
	@Column(name="Pincode")
	private String Pincode;
	
	@Column(name="Latitude")
	private float Latitude;
	
	@Column(name="Longitude")
	private float Longitude;
	
	

	public User(String email, String password, String area, String address, String pincode, float latitude,
			float longitude) {
		super();
		this.email = email;
		this.password = password;
		Area = area;
		Address = address;
		Pincode = pincode;
		Latitude = latitude;
		Longitude = longitude;
	}
	
	

	public User() {
		
	}



	public String getemail() {
		return email;
	}

	public void setemail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getArea() {
		return Area;
	}

	public void setArea(String area) {
		Area = area;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
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
