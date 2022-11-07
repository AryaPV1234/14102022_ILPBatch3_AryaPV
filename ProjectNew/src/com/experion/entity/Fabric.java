package com.experion.entity;

public class Fabric {
	private String materialType;
	private String materialCode;
	public Fabric(String materialType, String materialCode) {
		super();
		this.materialType = materialType;
		this.materialCode = materialCode;
	}
	public String getMaterialType() {
		return materialType;
	}
	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}
	public String getMaterialCode() {
		return materialCode;
	}
	public void setMaterialCode(String materialCode) {
		this.materialCode = materialCode;
	}
	

}
