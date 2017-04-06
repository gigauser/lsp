package com.home.ls.service;

import org.springframework.web.client.RestTemplate;

import com.home.ls.domain.Location;
import com.home.ls.domain.RestRespose;

public class LocationManagerImpl implements LocationManager{
	
	public LocationManagerImpl(){};
	
	public Location getLocationByIp(String ip) {
		
		StringBuilder url = new StringBuilder().
                append("http://geo.groupkt.com/ip/172.217.3.14/json");
//                append("?PP.USERID=" + student.getUserId).
//                append("&debugflag=" + student.isDebugFlag);// so on
	
		// Call service
        RestTemplate restTemplate = new RestTemplate();
		
        RestRespose result = restTemplate.getForObject(url.toString(), RestRespose.class);
		
		return new Location(ip);
		
	}
}
