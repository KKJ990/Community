package com.example.Community.PostRepository;

import java.util.List;

import javax.persistence.EntityManager;



public class JpaPostRepository implements PostRepository {
	
	private final EntityManager em;
	
	
	public JpaPostRepository(EntityManager em) {
		
		this.em =em;
	}

	@Override
	public Post Posting(Post post) {
		// TODO Auto-generated method stub
		
		em.persist(post);
		
		return post;
		
	}

	@Override
	public String Delete(String userid) {
		// TODO Auto-generated method stub
		
		em.remove(userid);
		
		return userid;
	}

	@Override
	public List<Post> findByuserid(String postuserid) {
		
		List<Post> result=em.createQuery("select p from Post p where p.postuserid= :postuserid",Post.class)
				.setParameter("postuserid", postuserid)
				.getResultList();
		return result;
	}

	@Override
	public List<Post> findBytitle(String title) {
		// TODO Auto-generated method stub
		List<Post> result = em.createQuery("select p from Post p where p.title= :title",Post.class)
								.setParameter("title", title)
								.getResultList();
		return result;
	}

	@Override
	public Post UpdatePost(Post afterpost) {
		// TODO Auto-generated method stub
		Post beforepost = new Post();
		
		beforepost.setTitle(afterpost.getTitle());
		beforepost.setContent(afterpost.getContent());
		
		return afterpost;
	}

}
