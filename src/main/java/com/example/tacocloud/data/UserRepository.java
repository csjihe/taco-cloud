package com.example.tacocloud.data;

import org.springframework.data.repository.CrudRepository;
import com.example.tacocloud.User;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);

}
