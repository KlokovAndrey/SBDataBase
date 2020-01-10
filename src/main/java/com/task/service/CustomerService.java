package com.task.service;

import com.task.entity.Customer;
import com.task.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public Customer findById(int id) {
        Optional<Customer> optional = customerRepository.findById(id);
        return optional.orElse(new Customer());
    }

    public List<Customer> findBySurname(String surname) {
        return customerRepository.findBySurname(surname);
    }

    public List<Customer> findByArea(String area) {
        return customerRepository.findByArea(area);
    }


    public List<Customer> findByDiscount(double discount) {
        return customerRepository.findByDiscount(discount);
    }

    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    public void deleteById(int id) {
        customerRepository.deleteById(id);
    }
}