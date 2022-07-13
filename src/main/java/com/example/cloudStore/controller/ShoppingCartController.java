package com.example.cloudStore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.cloudStore.repository.ItemRepository;
import com.example.cloudStore.repository.StoreRepository;
import com.example.cloudStore.service.ItemService;
import com.example.cloudStore.service.ShoppingCartService;

@RestController
@RequestMapping("/cart")
public class ShoppingCartController {
	@Autowired
	private ItemRepository itemRepository;
	
	@Autowired
	private StoreRepository storeRepository;
	
	@Autowired
	private ShoppingCartService shoppingCartService;
	
	@Autowired
	private ItemService productService;
	
	
	 @GetMapping("/")
    public ModelAndView shoppingCart() {
        ModelAndView modelAndView = new ModelAndView("/shoppingCart");
        modelAndView.addObject("products", shoppingCartService.getProductsInCart());
        modelAndView.addObject("total", shoppingCartService.getTotal().toString());
        return modelAndView;
    }
	 
	 
	 @GetMapping("/addProduct/{productId}")
	    public ModelAndView addProductToCart(@PathVariable("productId") Long productId) {
	        productService.findById(productId);
	        return shoppingCart();
	  }
	 
	 @GetMapping("/shoppingCart/removeProduct/{productId}")
	    public ModelAndView removeProductFromCart(@PathVariable("productId") Long productId) {
	        productService.findById(productId);
	        return shoppingCart();
	    }

	    @GetMapping("/shoppingCart/checkout")
	    public ModelAndView checkout() {
	        try {
	            shoppingCartService.checkout();
	        } catch (Exception e) {
	            return shoppingCart().addObject("outOfStockMessage", e.getMessage());
	        }
	        return shoppingCart();
	    }

}
