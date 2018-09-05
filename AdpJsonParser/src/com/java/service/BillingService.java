package com.java.service;

import java.util.List;
import java.util.Map;

import com.java.model.ShoppingCart;

public interface BillingService {

	public Double calculateBill(Map<Integer, Integer> slabMap, Map<Integer, Integer> productCategoryMap, List<ShoppingCart> carts);
}
