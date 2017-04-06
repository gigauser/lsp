/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.home.ls.web.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import com.home.ls.domain.GeoIso2;
import com.home.ls.domain.Location;
import com.home.ls.domain.ResposeGeoIso2;
import com.home.ls.domain.RestRespose;
import com.home.ls.service.IpResolverService;

/**
 *
 * @author hchen
 */
@Path("greeting")
public class GreetingResource {

    @Autowired
    private IpResolverService ipResolverService;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public RestRespose getGreeting(@QueryParam("name") String name) {
        
        Location loc = ipResolverService.getLocationByIp(name);
        
        ResposeGeoIso2 lo= new ResposeGeoIso2(new  GeoIso2("cois2", "sds", "sddd"));
        
        		
        return new RestRespose(lo);
    }
}
