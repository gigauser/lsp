/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.home.ls.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.home.ls.service.IpLocationResolveService;
import com.home.ls.service.IpLocationResolveServiceImpl;
import com.home.ls.service.LocationDao;
import com.home.ls.service.LocationDaoRemoteImpl;

/**
 *Java based Spring config
 *
 * @author hchen
 */
@Component
@Configuration
public class SpringJavaConfiguration {
    
    
    @Bean
    public LocationDao LocationManager() {
        return new LocationDaoRemoteImpl();
    }
    
    @Bean
    public IpLocationResolveService ipResolverService() {
        return new IpLocationResolveServiceImpl(LocationManager());
    }

    
}
