package com.task.repository;

import com.task.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StoreRepository extends JpaRepository<Store, Integer> {
    List<Store> findByName(String name);
    List<Store> findByArea(String area);
    List<Store> findByCommission(double commission);
}
