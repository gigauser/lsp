package com.home.ls.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


/**
*
* @author hchen
*/
@JsonIgnoreProperties
public class Location {
	private String ip;
	private String zipcode;
	private String isoCode2;
	private String isoCode3;
	
	public Location(String ip){
		this.ip = ip;
	}
	
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getIsoCode2() {
		return isoCode2;
	}
	public void setIsoCode2(String isoCode2) {
		this.isoCode2 = isoCode2;
	}
	public String getIsoCode3() {
		return isoCode3;
	}
	public void setIsoCode3(String isoCode3) {
		this.isoCode3 = isoCode3;
	}
	
	
	
}
