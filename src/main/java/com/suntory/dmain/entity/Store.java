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
@Table(name = "store")
public class Store {
	@Id
	@Column(name = "store_id")
	private String storeId;

	@Column(name = "store_name")
	private String storeName;

	@Column(name = "post_code")
	private String postCode;

	@Column(name = "adress")
	private String address;

	@Column(name = "phone_number")
	private String phoneNumber;

	@Column(name = "store_manager")
	private String storeManager;

}
