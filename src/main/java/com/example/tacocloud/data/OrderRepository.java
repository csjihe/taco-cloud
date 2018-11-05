package com.example.tacocloud.data;



import org.springframework.data.repository.CrudRepository;

import com.example.tacocloud.Order;

public interface OrderRepository
        extends CrudRepository<Order, Long> {

}