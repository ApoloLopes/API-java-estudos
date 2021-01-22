package com.example.java.api.customers.services;

import com.example.java.api.customers.domains.Customer;
import com.example.java.api.customers.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer save(Customer customer) {
        return customerRepository.save((customer));
    }

    public List<Customer> findAll() {
        // O código abaixo é o sugerido pela comunidade Spring Boot:
        List<Customer> customers = new ArrayList<>();
        customerRepository.findAll().forEach(customers :: add);

        // O código abaixo é a moda antiga, risos!
        /*List<Customer> customers = new ArrayList<Customer>();
        for (Customer customer : (List<Customer>) customerRepository.findAll()) {
             customers.add(customer);
        }*/

        // O código abaixo força o Iterable para List
        // return (List<Customer>) repository.findAll();

        return customers;
    }


}
