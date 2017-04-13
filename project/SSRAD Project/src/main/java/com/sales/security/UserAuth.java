package com.sales.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * User Auth - A class user to restrict usage to unauthenticated users of the app. 
 * Also handles the authentication of users to permit access - a gatekeeper of sorts.
 * @author Ryan Gordon
 *
 */

@EnableWebSecurity
public class UserAuth extends WebSecurityConfigurerAdapter {
	@Override
	public void configure(HttpSecurity httpSecurity) throws Exception {
		//What routes we are restricting, what ones we arent.
		httpSecurity.authorizeRequests()
					.antMatchers("/").permitAll()
					.antMatchers("/secure/**").authenticated()
					.and().formLogin().permitAll() // .loginPage("/login") // for custom login page
					.and().logout().permitAll();
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		//Per requirement 6.2 from doc. There should be 1 user 'user' with password 'password'
		auth.inMemoryAuthentication()
				.withUser("user").password("user").roles("USER"); //Maybe add ADMIN roles here?
	}
}

