package com.example.Spring_2.member;

import com.example.Spring_2.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService;

    @BeforeEach
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }

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
