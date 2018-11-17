package com.dlr.project.edu.config;

import org.springframework.beans.factory.annotation.Autowired;

//public class SpringSecurityConfig extends WebSecurityConfigurerAdapter{
public class SpringSecurityConfig {

/*
	
	  @Autowired
	    private AccessDeniedHandler accessDeniedHandler;

	 
	    @Override
	    protected void configure(HttpSecurity http) throws Exception {

	        http.csrf().disable()
	                .authorizeRequests()
	                .antMatchers("/", "/home", "/about").permitAll()
	                .antMatchers("/admin/**").hasAnyRole("ADMIN")
	                .antMatchers("/user/**").hasAnyRole("USER")
	                .anyRequest().authenticated()
	                .and()
	                .formLogin()
	                .loginPage("/login")
	                .permitAll()
	                .and()
	                .logout()
	                .permitAll()
	                .and()
	                .exceptionHandling().accessDeniedHandler(accessDeniedHandler);
	    }


	    @Autowired
	    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {

	        auth.inMemoryAuthentication()
	                .withUser("user").password("user").roles("USER")
	                .and()
	                .withUser("admin").password("admin").roles("ADMIN");
	    }

	   */

}
