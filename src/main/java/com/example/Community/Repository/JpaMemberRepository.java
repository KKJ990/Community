package com.example.Community.Repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;

public class JpaMemberRepository implements MemberRepository {
	
	private final EntityManager em;
	
	public JpaMemberRepository(EntityManager em) {
		
		this.em =em;
	}

	@Override
	public Member saveMember(Member member) {
		em.persist(member);
		return member;
	}
	
	@Override
	public Optional<Member> findbyId(Long id) {
		
		Member member = em.find(Member.class, id);
		return Optional.ofNullable(member);
		
	}

	@Override
	public Optional<Member> findbyuserid(String userid) {
		
		List<Member> result=em.createQuery("select m from Member m where m.userid= :userid",Member.class)
											.setParameter("userid", userid)
											.getResultList();
		
		return result.stream().findAny();
	}

	


	@Override
	public List<Member> findAll() {
		// TODO Auto-generated method stub
		List<Member> result = em.createQuery("select m from Member  m ",Member.class)
								.getResultList();
		
		return result;
		
	}

}
