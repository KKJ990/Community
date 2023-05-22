package Service;

import org.springframework.transaction.annotation.Transactional;


import com.example.Community.PostRepository.Post;
import com.example.Community.PostRepository.PostRepository;


@Transactional
public class PostService {
	Post post =new Post();
	private PostRepository postRepository;
	private String userid;  //ueserid를 계속 가지고있어야해서 선언
	
	public PostService(PostRepository postRepository) {
		
		this.postRepository=postRepository;
		
		
	}
	
	
	public Long WritePost(Post post) {
		
		if(post.getPostuserid()!=null) {
		
			postRepository.Posting(post);
			
		}
		else {
			
			post.setPostuserid(this.getUserid());
			postRepository.Posting(post);
		}
		return post.getTitleid();
		
	}


	public String getUserid() {
		return userid;
	}


	public void setUserid(String userid) {
		this.userid = userid;
	}
		

	

}
