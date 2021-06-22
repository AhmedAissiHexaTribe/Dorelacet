package com.example.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Customer;
import com.example.models.MessageResponse;
import com.example.repositories.CustomerRepository;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    public MessageResponse save(Customer customer){
        boolean exist = customerRepository.existsById((customer.getId()));
        if (exist) {
            return new MessageResponse(false,"Not Success","Existing");
        }
        customerRepository.save(customer);
        return new MessageResponse(true, "Success", "Backend responded save ok");
    }
    public MessageResponse update(Customer customer){
        customerRepository.save(customer);
        return new MessageResponse(true, "Success", "Backend responded update  ok");
    }
    public MessageResponse delete(Long id) {
        customerRepository.deleteById(id);
        return new MessageResponse(true, "Success", "Backend responded delete ok");
    }
    public Customer findById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}