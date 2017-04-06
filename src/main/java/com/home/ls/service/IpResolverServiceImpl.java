package com.home.ls.service;

import com.home.ls.domain.Location;


//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

//import org.springframework.web.client.RestTemplate;


public class IpResolverServiceImpl implements IpResolverService{

//	private static final Logger log = LoggerFactory.getLogger(IpResolverServiceImpl.class);
	
	private LocationManager locationManager;
	
	public IpResolverServiceImpl(LocationManager locationManager){
		this.locationManager = locationManager;
	}
	
	public Location getLocationByIp(String ip) {
		System.out.println(ip);
		
		StringBuilder url = new StringBuilder().
                append("http://geo.groupkt.com/ip/172.217.3.14/json");
		
		locationManager.getLocationByIp(ip);
		
		return new Location(ip);
		
//		log.debug(ip);
//                append("?PP.USERID=" + student.getUserId).
//                append("&debugflag=" + student.isDebugFlag);// so on
	
		// Call service
//        RestTemplate restTemplate = new RestTemplate();
//		
//		String result = restTemplate.getForObject(url.toString(), String.class);
//		
//		log.debug(result);
		
	}
	

}
