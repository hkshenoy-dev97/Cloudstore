package com.example.cloudStore.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cloudStore.entity.Store;


@Repository
public interface StoreRepository extends JpaRepository<Store,Long>{
		
}

