package com.suntory.dmain.entity;




import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "customer")
public class Customer {
	@Id
	@Column(name = "customer_id")
	private String customerId;

	@Column(name = "customer_name")
	private String customerName;

	@Column(name = "post_code")
	private String postCode;

	@Column(name = "adress")
	private String adress;
	
	@Column(name = "phone_number")
	private String phoneNumber;
	
	@Column(name = "mail")
	private String mail;
	
	@Column(name = "manager")
	private String manager;
}
