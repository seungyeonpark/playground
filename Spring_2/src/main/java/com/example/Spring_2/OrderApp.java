package com.example.Spring_2;

import com.example.Spring_2.member.Grade;
import com.example.Spring_2.member.Member;
import com.example.Spring_2.member.MemberService;
import com.example.Spring_2.order.Order;
import com.example.Spring_2.order.OrderService;

public class OrderApp {

    public static void main(String[] args) {

        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();

        long memberId = 1L;
        Member member = new Member(memberId, "member1", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(1L, "item1", 10000);

        System.out.println("order = " + order);
    }
}
