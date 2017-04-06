package com.home.ls.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RestRespose {
	private ResposeGeoIso2 geoIso2;

	public RestRespose(){}
	
	public RestRespose(ResposeGeoIso2 geoIso2){
		this.geoIso2 = geoIso2;
	}
	
	@JsonProperty("RestResponse")
	public ResposeGeoIso2 getGeoIso2() {
		return geoIso2;
	}

	public void setGeoIso2(ResposeGeoIso2 geoIso2) {
		this.geoIso2 = geoIso2;
	}
}
