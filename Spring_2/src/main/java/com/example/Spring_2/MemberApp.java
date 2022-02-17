package com.example.Spring_2;

import com.example.Spring_2.member.Grade;
import com.example.Spring_2.member.Member;
import com.example.Spring_2.member.MemberService;

public class MemberApp {

    public static void main(String[] args) {

        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();

        Member member = new Member(1L, "member1", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);

        System.out.println("member = " + member);
        System.out.println("find member = " + findMember);
    }
}
