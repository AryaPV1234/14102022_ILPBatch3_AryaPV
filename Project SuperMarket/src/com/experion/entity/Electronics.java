package com.experion.entity;

public class Electronics extends Product{
	private String electronicsType;

	

	public Electronics(String productCode, String productName, String productPrice, String electronicsType) {
		super(productCode, productName, productPrice);
		this.electronicsType = electronicsType;
	}

	public String getElectronicsType() {
		return electronicsType;
	}

	public void setElectronicsType(String electronicsType) {
		this.electronicsType = electronicsType;
	}

	
}
