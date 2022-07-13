package com.example.cloudStore.service;
import java.math.BigDecimal;
import java.util.Map;

import com.example.cloudStore.entity.Item;


public interface ShoppingCartService {

    void addProduct(Item item);

    void removeProduct(Item item);

    Map<Item,Long> getProductsInCart();

    void checkout() ;

    BigDecimal getTotal();
}