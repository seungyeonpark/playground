package com.example.Spring_2.member;

public interface MemberRepository {
    void save(Member member);
    Member findById(Long memberId);
}
