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
	// 顧客ID
	@Id
	@Column(name = "customer_id")
	private String customerId;
	// 顧客名
	@Column(name = "customer_name")
	private String customerName;
	// 郵便番号
	@Column(name = "post_code")
	private String postCode;
	// 住所
	@Column(name = "adress")
	private String adress;
	//　電話番号
	@Column(name = "phone_number")
	private String phoneNumber;
	// メールアドレス
	@Column(name = "mail")
	private String mail;
	// 担当者
	@Column(name = "manager")
	private String manager;
}
