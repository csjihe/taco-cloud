package com.example.tacocloud.data;

import org.springframework.data.repository.CrudRepository;

import com.example.tacocloud.Ingredient;

public interface IngredientRepository
        extends CrudRepository<Ingredient, String> {

}
