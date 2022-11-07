package com.experion.service;

public class Product {
	
	private String Fabric ;
	private String Electronics;
	private String ProductExchange;
    private String ProductRepair;
    private String WarrantyReplacement;
    private char bill;
	public Product(String fabric, String electronics, String productExchange, String productRepair,
			String warrantyReplacement, char bill) {
		super();
		Fabric = fabric;
		Electronics = electronics;
		ProductExchange = productExchange;
		ProductRepair = productRepair;
		WarrantyReplacement = warrantyReplacement;
		this.bill = bill;
	}
	public String getFabric() {
		return Fabric;
	}
	public void setFabric(String fabric) {
		Fabric = fabric;
	}
	public String getElectronics() {
		return Electronics;
	}
	public void setElectronics(String electronics) {
		Electronics = electronics;
	}
	public String getProductExchange() {
		return ProductExchange;
	}
	public void setProductExchange(String productExchange) {
		ProductExchange = productExchange;
	}
	public String getProductRepair() {
		return ProductRepair;
	}
	public void setProductRepair(String productRepair) {
		ProductRepair = productRepair;
	}
	public String getWarrantyReplacement() {
		return WarrantyReplacement;
	}
	public void setWarrantyReplacement(String warrantyReplacement) {
		WarrantyReplacement = warrantyReplacement;
	}
	public char getBill() {
		return bill;
	}
	public void setBill(char bill) {
		this.bill = bill;
	}
    
	
    
}