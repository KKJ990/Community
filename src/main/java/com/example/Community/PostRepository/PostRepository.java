package com.example.Community.PostRepository;

import java.util.List;

public interface PostRepository {
	

	public Post Posting(Post post);
	public String Delete(String userid);
	public List<Post> findByuserid(String postuserid);
	public List<Post> findBytitle(String title);
	public Post UpdatePost(Post post);
	

}
