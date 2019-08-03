package com.rayyanshaji.rest.services.restfulwebservices.basic.auth;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@ComponentScan(value = {"com.rayyanshaji.rest.services.restfulwebservices"}) 
@Configuration
@EnableWebSecurity
public class SpringSecurityConfigurationBasicAuth extends WebSecurityConfigurerAdapter{
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.cors().and()
		.csrf().disable()	
		.authorizeRequests()
		//.antMatchers(HttpMethod.OPTIONS,"/**").permitAll()
		.antMatchers(HttpMethod.GET,"/**").permitAll()
				.anyRequest().authenticated()
				.and()
			//.formLogin().and()
			.httpBasic();
	}
}
	
	
