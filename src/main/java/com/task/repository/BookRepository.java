package com.task.repository;

import com.task.entity.Book;
import com.task.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {
    List<Book> findByName(String name);
    List<Book> findByCost(double cost);
    List<Book> findByWarehouse(String warehouse);
    List<Book> findByNumber(int number);
}
