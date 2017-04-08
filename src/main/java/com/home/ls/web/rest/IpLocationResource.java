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

import com.home.ls.domain.Location;
import com.home.ls.service.IpLocationResolveService;

/**
 *Restful service entry point for the Ip based Location search
 *
 * @author hchen
 */
@Path("location")
public class IpLocationResource {

    @Autowired
    private IpLocationResolveService ipResolverService;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Location getGreeting(@QueryParam("ip") String ip) {
        
    	Location location = ipResolverService.getLocationByIp(ip);
        		
        return location;
    }
}
