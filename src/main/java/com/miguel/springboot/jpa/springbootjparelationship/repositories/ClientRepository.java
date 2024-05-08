package com.miguel.springboot.jpa.springbootjparelationship.repositories;

import org.springframework.data.repository.CrudRepository;

import com.miguel.springboot.jpa.springbootjparelationship.entities.Client;

public interface ClientRepository extends CrudRepository<Client, Long>{
    
}
