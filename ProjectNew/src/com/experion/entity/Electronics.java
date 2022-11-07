package com.experion.entity;

public class Electronics {
	private String deviceCode;
	private String deviceName;
	public Electronics(String deviceCode, String deviceName) {
		super();
		this.deviceCode = deviceCode;
		this.deviceName = deviceName;
	}
	public String getDeviceCode() {
		return deviceCode;
	}
	public void setDeviceCode(String deviceCode) {
		this.deviceCode = deviceCode;
	}
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	

}
