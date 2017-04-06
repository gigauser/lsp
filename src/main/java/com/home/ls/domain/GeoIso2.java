package com.home.ls.domain;

public class GeoIso2 {
	private String countryIso2;
	private String stateAbbr;
	private String postal;
	private String continent;
	private String state;
	private String longitude;
	private String latitude;
	private String ds;
	private String network;
	private String city;
	private String country;
	private String ip;
	
	public GeoIso2(){}
			
	public GeoIso2(String countryIso2, String stateAbbr, String postal){
		this.countryIso2 = countryIso2;
		this.stateAbbr = stateAbbr;
		this.postal = postal;
	}
	
	public String getCountryIso2() {
		return countryIso2;
	}
	public void setCountryIso2(String countryIso2) {
		this.countryIso2 = countryIso2;
	}
	public String getStateAbbr() {
		return stateAbbr;
	}
	public void setStateAbbr(String stateAbbr) {
		this.stateAbbr = stateAbbr;
	}
	public String getPostal() {
		return postal;
	}
	public void setPostal(String postal) {
		this.postal = postal;
	}
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getDs() {
		return ds;
	}
	public void setDs(String ds) {
		this.ds = ds;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getNetwork() {
		return network;
	}
	public void setNetwork(String network) {
		this.network = network;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	
	
	
}
