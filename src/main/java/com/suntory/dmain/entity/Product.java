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
@Table(name = "product")
public class Product {
	// 商品ID
	@Id
	@Column(name = "product_id")
	private String productId;
	// 価格ID
	@Column(name = "product_name")
	private String productName;
	//　成分ID
	@Column(name = "component_id")
	private String componentId;
	// 容器ID
	@Column(name = "container_id")
	private String containerId;

}
