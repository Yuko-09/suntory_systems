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
	// 店舗ID
	@Id
	@Column(name = "store_id")
	private String storeId;
	// 店舗名
	@Column(name = "store_name")
	private String storeName;
	// 郵便番号
	@Column(name = "post_code")
	private String postCode;
	// 住所
	@Column(name = "adress")
	private String address;
	// 電話番号
	@Column(name = "phone_number")
	private String phoneNumber;
	// 担当者
	@Column(name = "store_manager")
	private String storeManager;

}
