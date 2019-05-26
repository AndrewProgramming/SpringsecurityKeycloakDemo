package com.andrewprogramming.keycloakdemo.dao;

import com.andrewprogramming.keycloakdemo.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerDAO extends CrudRepository<Customer, Long> {

}
