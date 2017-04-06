/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.home.ls.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.home.ls.service.IpResolverService;
import com.home.ls.service.IpResolverServiceImpl;
import com.home.ls.service.LocationManager;
import com.home.ls.service.LocationManagerImpl;

/**
 *
 * @author hchen
 */
@Component
@Configuration
public class SpringJavaConfiguration {
    
    
    @Bean
    public LocationManager LocationManager() {
        return new LocationManagerImpl();
    }
    
    @Bean
    public IpResolverService ipResolverService() {
        return new IpResolverServiceImpl(LocationManager());
    }

    
}
