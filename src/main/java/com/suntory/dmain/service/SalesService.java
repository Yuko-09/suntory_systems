package com.suntory.dmain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suntory.dmain.entity.Sales;
import com.suntory.dmain.repository.SalesRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional(rollbackOn = Exception.class)
public class SalesService {
	

	/**
	 * セールス情報　Service
	 * 
	 */
	@Autowired
	SalesRepository salesRepository;
	
	public List<Sales> searchAll() {
		// TODO 自動生成されたメソッド・スタブ
		return salesRepository.findAll();
	}
//	 public List<Sales> searchAllWithProductInfo() {
//	        List<Sales> salesList = salesRepository.findAll();
//	        for (Sales sale : salesList) {
//	            Product product = sale.getProduct();
//	            if (product != null) {
//	                // 商品名や関連情報をログに出力
//	                System.out.println("Product ID: " + product.getProductId());
//	                System.out.println("Product Name: " + product.getProductName());
//	                // 他の関連情報も必要に応じて出力
//	            }
//	        }
//	        return salesList;
//	    }


}


