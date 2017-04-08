package com.home.ls.service;

import com.home.ls.domain.GeoIso2;
import com.home.ls.domain.IsoCode;


/**
 * Dao layer for managing the location data
 *
 * @author hchen
 */
public interface LocationDao {
	/**
	 * Retrieve the GeoIso2 information based on Ip address
	 * @param ip
	 * @return GeoIso2
	 */
	public GeoIso2 getGeoIso2ByIp(String ip);
	
	/**
	 * Retrieve the IsoCode information based on Iso2code
	 * @param Iso2code
	 * @return  IsoCode
	 */
	public IsoCode getIsoCodeByIso2code(String iso2code);
}
