package com.home.ls.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResposeGeoIso2 {
	private GeoIso2 geoIso2;
	
	public ResposeGeoIso2(){}

	public ResposeGeoIso2(GeoIso2 geoIso2){
		this.geoIso2 = geoIso2;
	}
	
	@JsonProperty("result")
	public GeoIso2 getGeoIso2() {
		return geoIso2;
	}

	public void setGeoIso2(GeoIso2 geoIso2) {
		this.geoIso2 = geoIso2;
	}
}
