package com.java.service.impl;

import java.io.File;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.java.model.ShoppingCart;
import com.java.model.ShoppingCartFeet;
import com.java.service.ShoppingCartService;
import com.java.util.Constants;

public class ShoppingCartServiceImpl implements ShoppingCartService{

	public List<ShoppingCart> getShoppingCartItemList() {
		String filePath = Constants.SHOPPING_CART_ITEM;
		ObjectMapper mapper = new ObjectMapper();
		ShoppingCartFeet shoppingCart = null;	
		try {
			shoppingCart = mapper.readValue(new File(filePath), ShoppingCartFeet.class);
			System.out.println(shoppingCart.getShoppingCart().size());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return shoppingCart.getShoppingCart();  
		
		
	}

}
