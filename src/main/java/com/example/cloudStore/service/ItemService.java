package com.example.cloudStore.service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.cloudStore.entity.Item;

import java.util.List;


public interface ItemService {
    List <Item> findById(Long id);

    Page<Item> findAllProductsPageable(Pageable pageable);
}

