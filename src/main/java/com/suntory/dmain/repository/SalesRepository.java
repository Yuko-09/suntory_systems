package com.suntory.dmain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suntory.dmain.entity.Sales;
/**
 * 
 * @author tanaka
 *
 */

public interface SalesRepository extends JpaRepository<Sales, String> {

}
