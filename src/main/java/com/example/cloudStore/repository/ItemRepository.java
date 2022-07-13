package com.example.cloudStore.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cloudStore.entity.Item;



@Repository
public interface ItemRepository extends JpaRepository<Item,Long>{
	List<Item> findByNameContaining(String name);
}






