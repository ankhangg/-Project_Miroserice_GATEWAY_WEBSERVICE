package com.ankhang.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
public class SecurityConfig {
	
	
//	@Bean
//	public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
//		http
//				.authorizeExchange()
//				.pathMatchers("/employee-app/home","/employee-app/homeauthen")
//				.permitAll()
//			.and()
//				.authorizeExchange()
//				.anyExchange()
//				.authenticated()
//			.and()
//				.oauth2Login();
//
//		return http.build();
//	}
	

	@Bean
	public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
		http
				.authorizeExchange()
				.pathMatchers("/employee-app/homeauthen")
				.authenticated()
			.and()
				.authorizeExchange()
				.anyExchange()
				.permitAll()
			.and()
				.oauth2Login();

		return http.build();
	}
	
}
