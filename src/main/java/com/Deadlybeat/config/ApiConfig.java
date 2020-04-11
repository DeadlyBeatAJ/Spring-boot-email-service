package com.Deadlybeat.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.ui.freemarker.FreeMarkerConfigurationFactoryBean;

//Configuration is written to map the freemarker template for our mail template

@Configuration
public class ApiConfig {

	/* here we will define where is our FTL:- Freemarker template file 
	 * primary is added as one more instance of this FreeMarkerConfigurationFactoryBean going to used in service class*/
	
	@Primary
	@Bean
	public FreeMarkerConfigurationFactoryBean factoryBean() {
		
		//create a  bean of this
		FreeMarkerConfigurationFactoryBean bean=new FreeMarkerConfigurationFactoryBean();
		
		//we will store all template in src/main/resource->Template folder and load file form there
		bean.setTemplateLoaderPath("classpath:/templates");
		return bean;
	}
}
