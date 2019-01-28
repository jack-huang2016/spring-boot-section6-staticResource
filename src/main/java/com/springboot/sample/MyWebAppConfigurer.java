package com.springboot.sample;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MyWebAppConfigurer extends WebMvcConfigurerAdapter {
	  @Override
	    public void addResourceHandlers(ResourceHandlerRegistry registry) {
		  	//相对路径
	        registry.addResourceHandler("/myres/**").addResourceLocations("classpath:/myres/");
	        //绝对路径
	        registry.addResourceHandler("/myimgs/**").addResourceLocations("file:C:/Users/Administrator/Desktop/TempWork/2019/1/28/");
	        super.addResourceHandlers(registry);
	    }
}
