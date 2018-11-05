package com.example.tacocloud.datajdbc;

import com.example.tacocloud.Order;

import org.springframework.data.repository.CrudRepository;



public interface OrderRepository
        extends CrudRepository<Order, Long> {

}