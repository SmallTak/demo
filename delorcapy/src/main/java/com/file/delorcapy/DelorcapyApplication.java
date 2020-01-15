package com.file.delorcapy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.ResourceUtils;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@SpringBootApplication
public class DelorcapyApplication extends WebMvcConfigurationSupport {

	public static void main(String[] args) {
		SpringApplication.run(DelorcapyApplication.class, args);
	}
	@Override
	protected void addResourceHandlers(ResourceHandlerRegistry resourceHandlerRegistry){
		resourceHandlerRegistry.addResourceHandler("/**").addResourceLocations(ResourceUtils.CLASSPATH_URL_PREFIX + "/templates/");
		resourceHandlerRegistry.addResourceHandler("/**").addResourceLocations(ResourceUtils.CLASSPATH_URL_PREFIX + "/static/");
	}
}
