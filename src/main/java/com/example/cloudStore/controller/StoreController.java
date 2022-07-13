package com.example.cloudStore.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.cloudStore.entity.Item;
import com.example.cloudStore.entity.Store;
import com.example.cloudStore.entity.User;
import com.example.cloudStore.repository.ItemRepository;
import com.example.cloudStore.repository.StoreRepository;
import com.example.cloudStore.repository.UserRepository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;




@RestController
@RequestMapping("/")
public class StoreController {
	
	@Autowired
	private ItemRepository itemRepository;
	
	@Autowired
	private StoreRepository storeRepository;
	
	
	
	
	@RequestMapping("/store")
	public List<Store> get_store_details() throws Exception{
		
		
			List<Store> storeList=this.storeRepository.findAll();
			
			if(storeList.size()==0) {
				
				
				ObjectMapper mapper = new ObjectMapper();
				TypeReference< List<Store> > typeReference = new TypeReference<List<Store>>(){};
				InputStream inputStream = TypeReference.class.getResourceAsStream("/json/datab79e8b2.json");
				
				try {
					List<Store> Stores = mapper.readValue(inputStream,typeReference);
					storeRepository.saveAll(Stores);
					System.out.println("Stores Saved!");
				} catch (IOException e){
					System.out.println("Unable to save Stores: " + e.getMessage());
				}
				
				

			}
			
			storeList=this.storeRepository.findAll();
			
			return storeList;
   }
	
	
	@RequestMapping("/item")
	public List<Item> get_item_details() throws Exception{
		
		
			List<Item> itemList=this.itemRepository.findAll();
			
			if(itemList.size()==0) {
				
				
				ObjectMapper mapper = new ObjectMapper();
				TypeReference< List<Item> > typeReference = new TypeReference<List<Item>>(){};
				InputStream inputStream = TypeReference.class.getResourceAsStream("/json/items22808a8.json");
				
				try {
					List<Item> Items = mapper.readValue(inputStream,typeReference);
					itemRepository.saveAll(Items);
					System.out.println("Items Saved!");
				} catch (IOException e){
					System.out.println("Unable to save Items: " + e.getMessage());
				}
				
				

			}
			
			itemList=this.itemRepository.findAll();
			
			return itemList;
   }
	
	@GetMapping("/item/{name}")
	public List<Item> getRecipeById(@PathVariable(value="name") String Name) {
		return this.itemRepository.findByNameContaining(Name);
	}
	
}
