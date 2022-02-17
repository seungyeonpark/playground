package com.example.Spring_2.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();

    @Test
    public void join() {
        // given
        Member newMember = new Member(1L, "member1", Grade.VIP);

        // when
        memberService.join(newMember);
        Member findMember = memberService.findMember(1L);

        // then
        Assertions.assertThat(newMember).isEqualTo(findMember);
    }
}
