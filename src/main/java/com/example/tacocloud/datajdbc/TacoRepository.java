package com.example.tacocloud.datajdbc;


import com.example.tacocloud.Taco;
import org.springframework.data.repository.CrudRepository;



public interface TacoRepository
        extends CrudRepository<Taco, Long> {

}
