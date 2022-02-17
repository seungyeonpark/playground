package com.example.Spring_2.order;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
