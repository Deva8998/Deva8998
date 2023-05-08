package com.chan.frstprgboot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
public class TravellerSecurityConfig {
	
	@Autowired
	TravellerAuthProvider travellerAuthProvider;
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests().requestMatchers("/welcome/**").permitAll()
		.requestMatchers("/login/**").permitAll()
		.requestMatchers("/listtour/**").permitAll()
		.requestMatchers("/addtraveller/**").authenticated();
		
		http.httpBasic();
		http.csrf().disable();
		return http.build();
		
		
	}
	
	@Bean
	public AuthenticationManager authManager(HttpSecurity http) throws Exception {

		AuthenticationManagerBuilder authenticationManagerBuilder = http
				.getSharedObject(AuthenticationManagerBuilder.class);
		authenticationManagerBuilder.authenticationProvider(travellerAuthProvider);
		return authenticationManagerBuilder.build();
	}

}
