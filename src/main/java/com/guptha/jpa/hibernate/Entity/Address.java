package com.guptha.jpa.hibernate.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Size(min = 3, message = "fisrt name must have 3 characters")
	private String first_name;
	@Size(min = 3, message = "last name must have 3 characters")
	private String last_name;
	@Size(max = 10, message = "moblie number must have 10 numbers")
	private Long moblie_number;
	@NotNull
	private String address1;
	private String address2;
	@NotNull
	private String street;
	@NotNull
	private String city;
	@NotNull
	private String zipcode;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String first_name, String last_name, Long moblie_number, String address1, String address2,
			String street, String city, String zipcode) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.moblie_number = moblie_number;
		this.address1 = address1;
		this.address2 = address2;
		this.street = street;
		this.city = city;
		this.zipcode = zipcode;
	}

	public Long getId() {
		return id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public Long getMoblie_number() {
		return moblie_number;
	}

	public String getAddress1() {
		return address1;
	}

	public String getAddress2() {
		return address2;
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public void setMoblie_number(Long moblie_number) {
		this.moblie_number = moblie_number;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

}
