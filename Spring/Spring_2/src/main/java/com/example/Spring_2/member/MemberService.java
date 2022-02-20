package com.example.Spring_2.member;

public interface MemberService {

    void join(Member member);
    Member findMember(Long memberId);
}
