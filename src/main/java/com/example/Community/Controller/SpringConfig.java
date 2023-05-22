	package com.example.Community.Controller;
	
	
	
	import javax.persistence.EntityManager;
	import org.springframework.context.annotation.Bean;
	import org.springframework.context.annotation.Configuration;
	
	import com.example.Community.PostRepository.JpaPostRepository;
	import com.example.Community.PostRepository.PostRepository;
	import com.example.Community.Repository.*;
	
	import Service.LoginService;
	import Service.PostService;
	
	
	
	@Configuration
	public class SpringConfig {
		
		
		private final EntityManager em;
		
		public SpringConfig(EntityManager em) {
			
			this.em = em;
			
		}
	
		@Bean 
		public LoginService loginService(PostService postService) {
			
			
			return new LoginService(memberRepository(),postService);
		}
		@Bean
		public MemberRepository memberRepository() {
			
			
			return new JpaMemberRepository(em);
		}
		
		
		@Bean
		public PostService postService(PostRepository postRepository) {
			
			
			return new PostService(postRepository());
		}
		
		
		@Bean
		public PostRepository postRepository() {
			
			return new JpaPostRepository(em);
					
		}
		
		
		
	
	}
