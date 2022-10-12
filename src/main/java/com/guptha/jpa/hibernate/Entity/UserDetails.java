package com.guptha.jpa.hibernate.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class UserDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Size(min = 3, message = "user number alteast 3 characters")
	private String name;
	@NotNull
	private String email;
	@NotNull
	private String moblie_number;

	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDetails(@Size(min = 3, message = "user number alteast 3 characters") String name, @NotNull String email,
			@NotNull String moblie_number) {
		super();
		this.name = name;
		this.email = email;
		this.moblie_number = moblie_number;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getMoblie_number() {
		return moblie_number;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setMoblie_number(String moblie_number) {
		this.moblie_number = moblie_number;
	}

}
