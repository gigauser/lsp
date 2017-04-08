package com.home.ls.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response data wrapper for Geo data with Iso2 code
 * 
 * @author hchen
 */

public class GeoIso2RestRespose {
	private GeoIso2Response geoIso2Response;

	public GeoIso2RestRespose(){}
	
	public GeoIso2RestRespose(GeoIso2Response geoIso2Response){
		this.geoIso2Response = geoIso2Response;
	}
	
	@JsonProperty("RestResponse")
	public GeoIso2Response getGeoIso2Response() {
		return geoIso2Response;
	}

	public void setGeoIso2Response(GeoIso2Response geoIso2Response) {
		this.geoIso2Response = geoIso2Response;
	}
	
	
	public class GeoIso2Response {
		private GeoIso2 geoIso2;
		
		public GeoIso2Response(){}

		public GeoIso2Response(GeoIso2 geoIso2){
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
}
