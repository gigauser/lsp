package com.home.ls.service;

import com.home.ls.domain.Location;

/**
 * Facade layer for IP based location search service
 * 
 * @author hchen
 */
public interface IpLocationResolveService {
    
	public Location getLocationByIp(String ip);
	
}
