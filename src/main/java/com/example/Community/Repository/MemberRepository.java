package com.example.Community.Repository;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member member = new Member();
    public Member saveMember(Member member);
    public Optional<Member> findbyuserid(String userid);
    public Optional<Member> findbyId(Long id);
    public List<Member> findAll();
}
