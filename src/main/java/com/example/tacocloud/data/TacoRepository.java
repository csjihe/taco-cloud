package com.example.tacocloud.data;

import org.springframework.data.repository.CrudRepository;

import com.example.tacocloud.Taco;

public interface TacoRepository
        extends CrudRepository<Taco, Long> {

}
