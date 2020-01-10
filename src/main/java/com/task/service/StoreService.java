package com.task.service;

import com.task.entity.Customer;
import com.task.entity.Store;
import com.task.repository.CustomerRepository;
import com.task.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StoreService {

    @Autowired
    private StoreRepository storeRepository;

    public List<Store> findAll() {
        return storeRepository.findAll();
    }

    public Store findById(int id) {
        Optional<Store> optional = storeRepository.findById(id);
        return optional.orElse(new Store());
    }

    public List<Store> findByName(String name) {
        return storeRepository.findByName(name);
    }

    public List<Store> findByArea(String area) {
        return storeRepository.findByArea(area);
    }

    public List<Store> findByCommission(double commission) {
        return storeRepository.findByCommission(commission);
    }

    public void save(Store store) {
        storeRepository.save(store);
    }

    public void deleteById(int id) {
        storeRepository.deleteById(id);
    }
}
