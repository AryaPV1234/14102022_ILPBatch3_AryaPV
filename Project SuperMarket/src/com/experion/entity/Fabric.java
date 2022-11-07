package com.experion.entity;

import java.util.Scanner;

public class Fabric extends Product {
	private String fabricType;

	public Fabric(String productCode, String productName, String productPrice, String fabricType) {
		super(productCode, productName, productPrice);
		this.fabricType = fabricType;
	}

	public String getFabricType() {
		return fabricType;
	}

	public void setFabricType(String fabricType) {
		this.fabricType = fabricType;
	}
	
}


