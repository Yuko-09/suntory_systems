package com.suntory.dmain.entity;

import java.sql.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "sales")
public class Sales {
	
	//セールス番号
	@Id
	@Column(name = "sales_number")
	private String salesNumber;

	//年月日
	@Column(name = "target_date")
	private Date targetDate;
	//個数
	@Column(name = "quantity")
	private Integer quantity;
	//売上価格
	@Column(name = "sales_price")
	private Integer salesPrice;

	//商品ID
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "product_id", referencedColumnName = "product_id")
	private Product product;
	//商品名
	@Column(name = "product_name" )
	private String productName;

	//顧客ID
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
	private Customer customer;
	//顧客名
	@Column(name = "customer_name")
	private String customerName;

	//ストアID
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "store_id", referencedColumnName = "store_id")
	private Store store;
	//ストア名
	@Column(name = "store_name")
	private String storeName;

}
