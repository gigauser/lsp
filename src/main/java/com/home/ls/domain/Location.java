package com.home.ls.domain;

/**
 * Isocode data as well as ip and zipcode
 * 
 * @author hchen
 */

public class Location extends IsoCode {
	private String ip;
    private String zipcode;
	
	public Location(){}
	
	public Location(IsoCode isoCode, String ip, String zipcode ){
		super(isoCode.getName(), isoCode.getAlpha2_code(), isoCode.getAlpha3_code());
		this.ip=ip;
		this.zipcode = zipcode;
	}
	
	
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
}
