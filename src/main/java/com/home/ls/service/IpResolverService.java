package com.home.ls.service;

import com.home.ls.domain.Location;

public interface IpResolverService {
    
	public Location getLocationByIp(String ip);
	
}
