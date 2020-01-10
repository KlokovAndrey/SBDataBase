package com.task.repository;
import com.task.entity.Buy;
import com.task.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;
import java.util.List;

public interface BuyRepository extends JpaRepository<Buy, Integer> {
    List<Buy> findByDate(Date date);
    List<Buy> findBySellerId(int sellerId);
    List<Buy> findByCustomerId(int sellerId);
    List<Buy> findByBookId(int bookId);
    List<Buy> findByNumber(int number);
    List<Buy> findBySum(double sum);
}
