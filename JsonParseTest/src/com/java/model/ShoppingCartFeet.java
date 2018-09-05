package com.java.model;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ShoppingCartFeet {
	private ArrayList<ShoppingCart> shoppingCart = new ArrayList<ShoppingCart>();

	public ArrayList<ShoppingCart> getShoppingCart() {
		return shoppingCart;
	}

	public void setShoppingCart(ArrayList<ShoppingCart> shoppingCart) {
		this.shoppingCart = shoppingCart;
	}

	@Override
	public String toString() {
		return "ShoppingCartFeet [shoppingCart=" + shoppingCart + "]";
	}

		

}
