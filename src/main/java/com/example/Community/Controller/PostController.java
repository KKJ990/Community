package com.example.Community.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Community.PostRepository.Post;

import Service.PostService;



@Controller
public class PostController {
	
	private PostService postService;
	@Autowired
	public PostController(PostService postService) {
		
		this.postService = postService;
	}

	
	
	@PostMapping("PostButton")
	public String PostingButton() {
		
		
		
		return "PostingForm";
	}
	
	@PostMapping("PostComplete")
		public String PostingComplete(Post post){
			
		
	
			postService.WritePost(post);
		
		return "Main";
		}
		
		
	}
	

