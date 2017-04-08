package com.home.ls.service;

import com.home.ls.domain.GeoIso2;
import com.home.ls.domain.IsoCode;
import com.home.ls.domain.Location;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;


/**
 * Impl layer for IP based location search service
 * 
 * @author hchen
 */
public class IpLocationResolveServiceImpl implements IpLocationResolveService{

//	private static final Logger log = LoggerFactory.getLogger(IpLocationResolveServiceImpl.class);
	
	private LocationDao locationManager;
	
	public IpLocationResolveServiceImpl(LocationDao locationManager){
		this.locationManager = locationManager;
	}
	
	public Location getLocationByIp(String ip) {
//		log.info(ip);
		
		GeoIso2 geoIso2= locationManager.getGeoIso2ByIp(ip);
		
		IsoCode isoCode = locationManager.getIsoCodeByIso2code(geoIso2.getCountryIso2());
		
		return new Location(isoCode, ip, geoIso2.getPostal());
		
	}
	
}
