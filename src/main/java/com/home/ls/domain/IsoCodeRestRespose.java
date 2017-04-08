package com.home.ls.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response data wrapper for Iso code
 * 
 * @author hchen
 */

public class IsoCodeRestRespose {	
	private ResponseIsoCode responseIsoCode;

	public IsoCodeRestRespose(){}
	
	public IsoCodeRestRespose(ResponseIsoCode responseIsoCode){
		this.responseIsoCode = responseIsoCode;
	}
	
	@JsonProperty("RestResponse")
	public ResponseIsoCode getResponseIsoCode() {
		return responseIsoCode;
	}

	public void setResponseIsoCode(ResponseIsoCode responseIsoCode) {
		this.responseIsoCode = responseIsoCode;
	}
	
	
	public class ResponseIsoCode{
		private List<String> messages;
		private IsoCode isoCode;

		public ResponseIsoCode(){}
		
		@JsonProperty("result")
		public IsoCode getIsoCode() {
			return isoCode;
		}
		public void setIsoCode(IsoCode geoIso2) {
			this.isoCode = geoIso2;
		}
		
		@JsonProperty
		public List<String> getMessages() {
			return messages;
		}

		public void setMessages(List<String> messages) {
			this.messages = messages;
		}
		
	}
}
