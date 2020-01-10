package com.task.repository;

import com.task.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    List<Customer> findBySurname(String surname);
    List<Customer> findByArea(String area);
    List<Customer> findByDiscount(double discount);
}
