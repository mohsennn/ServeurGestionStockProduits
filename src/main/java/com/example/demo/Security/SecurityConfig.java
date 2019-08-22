package com.example.demo.Security;

import org.springframework.cglib.proxy.NoOp;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	protected void configure(HttpSecurity http) throws Exception {

		http.httpBasic().and().authorizeRequests().
	        	// l'utlisteur ayant le role "USER" peut acceder à tous les ressources sous /api
		 		antMatchers("/api/**").hasRole("USER").antMatchers("/**")
				// //l'utlisteur ayant le role "ADMIN" peut acceder à tous les ressources */*
				.hasRole("ADMIN").and().csrf().disable().headers().frameOptions().disable();

	}

	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().passwordEncoder(NoOpPasswordEncoder.getInstance())
				// user:possede un seul role USER
				.withUser("user").password("password1").roles("USER")
				.and()
				.withUser("admin").password("password2").roles("USER", "ADMIN");
               //admin:possede 2 roles :USER et ADMIN
	}

}
