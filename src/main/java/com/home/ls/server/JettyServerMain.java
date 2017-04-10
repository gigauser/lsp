/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.home.ls.server;

import java.net.URL;

import org.apache.log4j.xml.DOMConfigurator;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.servlet.ServletContainer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.request.RequestContextListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import com.home.ls.spring.config.SpringJavaConfiguration;

/**
 * Manage Jetty server, the project start point
 * 
 * @author hchen
 */
public class JettyServerMain {

	private Server server;

	private static JettyServerMain instance = new JettyServerMain();

	public static JettyServerMain get() {
		return instance;
	}

	protected JettyServerMain() {}

	public void startJettyWebApp(int httpPort, String webPath) throws Exception {
		ApplicationConfig applicationConfig = new ApplicationConfig();
		ServletHolder jerseyServlet = new ServletHolder(new ServletContainer(applicationConfig));

		ServletContextHandler context = new ServletContextHandler();

		context.setContextPath("/");
		context.addServlet(jerseyServlet, webPath);


		context.addEventListener(new ContextLoaderListener());
		context.addEventListener(new RequestContextListener());

		context.setInitParameter("contextClass", AnnotationConfigWebApplicationContext.class.getName());
		context.setInitParameter("contextConfigLocation", SpringJavaConfiguration.class.getName());

		Server server = new Server(httpPort);
		server.setHandler(context);

		server.start();

	}

	public void stopJettyWebApp() throws Exception {
		server.stop();
	}


	public static void main(String[] args) throws Exception {
		URL log4jUrl = Thread.currentThread().getContextClassLoader().getResource("log4j-cms.xml");
		DOMConfigurator.configure(log4jUrl);
		
		JettyServerMain.get().startJettyWebApp(8080, "/rest/*");
	}
}
