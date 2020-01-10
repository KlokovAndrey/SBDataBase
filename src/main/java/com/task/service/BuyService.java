package com.task.service;

import com.task.entity.Buy;
import com.task.entity.Store;
import com.task.repository.BuyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

@Service
public class BuyService {
    @Autowired
    private BuyRepository buyRepository;



    public List<Buy> findAll(){
        return buyRepository.findAll();
    }

    public Buy findById(int id){
        Optional<Buy> optional = buyRepository.findById(id);
        return optional.orElse(new Buy());
    }

    public List<Buy> findByDate(Date date){
        return buyRepository.findByDate(date);
    }

    public List<Buy> findBySellerId(int sellerId){
        return buyRepository.findBySellerId(sellerId);
    }

    public List<Buy> findByCustomerId(int customerId){
        return buyRepository.findByCustomerId(customerId);
    }

    public List<Buy> findByBookId(int bookId){
        return buyRepository.findByBookId(bookId);
    }

    public List<Buy> findByNumber(int number){
        return buyRepository.findByNumber(number);
    }

    public List<Buy> findBySum(double sum){
        return buyRepository.findBySum(sum);
    }

    public void save(Buy buy){
        buyRepository.save(buy);
    }

    public void deleteById(int id){
        buyRepository.deleteById(id);
    }

}