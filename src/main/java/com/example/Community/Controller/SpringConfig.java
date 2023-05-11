package com.example.Community.Controller;



import javax.persistence.EntityManager;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.Community.Repository.*;


import Service.LoginService;



@Configuration
public class SpringConfig {
	
	
	private final EntityManager em;
	
	public SpringConfig(EntityManager em) {
		
		this.em = em;
		
	}

	@Bean 
	public LoginService loginService() {
		
		
		return new LoginService(memberRepository());
	}
	@Bean
	public MemberRepository memberRepository() {
		
		
		return new JpaMemberRepository(em);
	}

}
