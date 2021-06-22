package com.example.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
	boolean existsByUserName(String string);
}
