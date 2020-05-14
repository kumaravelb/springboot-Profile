package com.profiles.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
/* @ConditionalOnClass(name="com.profiles.service.RequiredClass") */
@ConditionalOnMissingClass(value = "com.profiles.service.RequiredClass")
public class SpringConfig {
	
	@Bean
	public RequiredClass getService() {
		return new RequiredClass();
	}

}
