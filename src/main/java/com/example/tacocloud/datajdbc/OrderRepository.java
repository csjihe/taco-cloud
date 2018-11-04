package com.example.tacocloud.datajdbc;

import com.example.tacocloud.Order;

public interface OrderRepository {
    Order save(Order order);
}
