package com.ekta.secureapp;

import org.springframework.data.repository.CrudRepository;

public interface CustomerDAO extends CrudRepository<Customer, Long> {

}
