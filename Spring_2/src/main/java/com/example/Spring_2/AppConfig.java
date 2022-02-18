package com.example.Spring_2;

import com.example.Spring_2.discount.DiscountPolicy;
import com.example.Spring_2.discount.RateDiscountPolicy;
import com.example.Spring_2.member.MemberRepository;
import com.example.Spring_2.member.MemberService;
import com.example.Spring_2.member.MemberServiceImpl;
import com.example.Spring_2.member.MemoryMemberRepository;
import com.example.Spring_2.order.OrderService;
import com.example.Spring_2.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }
}
