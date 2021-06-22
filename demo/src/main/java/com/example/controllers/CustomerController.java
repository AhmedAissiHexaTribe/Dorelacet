package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Customer;
import com.example.models.MessageResponse;
import com.example.services.CustomerService;

@RestController
@RequestMapping("api/customer")
@CrossOrigin("*")
public class CustomerController {
	@Autowired
	private CustomerService customerService;

	@PostMapping
	public MessageResponse save(@RequestBody Customer customer) {
		return customerService.save(customer);
	}

	@PutMapping
	public MessageResponse update(@RequestBody Customer customer) {
		return customerService.update(customer);
	}

	@DeleteMapping("/{id}")
	public MessageResponse delete(@PathVariable Long id) {
		return customerService.delete(id);
	}

	@GetMapping
	public List<Customer> findAll() {
		return customerService.findAll();
	}

	@GetMapping("/{id}")
	public Customer findById(@PathVariable Long id) {
		return customerService.findById(id);
	}
}