package io.aiven.spring.mysql.demo;

import org.springframework.data.repository.CrudRepository;

import io.aiven.spring.mysql.demo.User;

public interface UserRepository extends CrudRepository<User,Integer> {
    
}
