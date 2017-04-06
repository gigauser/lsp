package com.home.ls.service;

import com.home.ls.domain.Location;

public interface LocationManager {
	public Location getLocationByIp(String ip);
}
