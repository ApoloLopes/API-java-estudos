package com.example.java.api.customers.repositories;

import com.example.java.api.customers.domains.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CustomerRepository extends CrudRepository<Customer, Long> {
}

/*
C - create
R - retrieve
U - update
D - delete
*/