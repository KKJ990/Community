//package com.example.Community.Repository;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Optional;
//
//public class MemberRepositoryMemory implements MemberRepository {
//
//    HashMap<String,Member> store = new HashMap<>();
//    
//    @Override
//    public Member saveMember(Member member) {
//
//        store.put(member.getId(), member);
//
//        return member;
//    }
//
//    @Override
//    public Optional<Member> findbyName(String name) {
//
//
//
//        return Optional.ofNullable(store.get(name));
//    }
//
//    @Override
//    public Optional<Member> findbyId(String id) {
//
//        return Optional.ofNullable(store.get(id));
//    }
//
//    @Override
//    public List<Member> findAll() {
//    	
//        return new ArrayList<>(store.values());
//    }
//
//	
//	
//
//
//}
