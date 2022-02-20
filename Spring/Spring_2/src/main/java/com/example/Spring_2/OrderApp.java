package com.example.Spring_2;

import com.example.Spring_2.member.Grade;
import com.example.Spring_2.member.Member;
import com.example.Spring_2.member.MemberService;
import com.example.Spring_2.order.Order;
import com.example.Spring_2.order.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderApp {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);

        long memberId = 1L;
        Member member = new Member(memberId, "member1", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(1L, "item1", 20000);

        System.out.println("order = " + order);
    }
}
