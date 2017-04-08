package com.home.ls.service;

import org.springframework.web.client.RestTemplate;

import com.home.ls.domain.GeoIso2;
import com.home.ls.domain.GeoIso2RestRespose;
import com.home.ls.domain.IsoCode;
import com.home.ls.domain.IsoCodeRestRespose;

/**
 * Dao Impl layer for managing the location data. This class retrieve the data from remote services
 *
 * @author hchen
 */
public class LocationDaoRemoteImpl implements LocationDao{
	
	public LocationDaoRemoteImpl(){};


	public GeoIso2 getGeoIso2ByIp(String ip) {
		StringBuilder url = new StringBuilder().
                append("http://geo.groupkt.com/ip/172.217.3.14/json");
	
		// Call service
        RestTemplate restTemplate = new RestTemplate();
		
        GeoIso2RestRespose result = restTemplate.getForObject(url.toString(), GeoIso2RestRespose.class);
		
		return result.getGeoIso2Response().getGeoIso2();
	}

	public IsoCode getIsoCodeByIso2code(String iso2code) {
		StringBuilder url = new StringBuilder().
                append("http://services.groupkt.com/country/get/iso2code/US");
	
		// Call service
        RestTemplate restTemplate = new RestTemplate();
		
        IsoCodeRestRespose result = restTemplate.getForObject(url.toString(), IsoCodeRestRespose.class);
		
		return result.getResponseIsoCode().getIsoCode();
	}
	
	
}
