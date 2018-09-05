package com.java.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.java.model.Bill;
import com.java.model.ShoppingCart;
import com.java.service.BillingService;

public class BillingServiceImpl implements BillingService {

	public Double calculateBill(Map<Integer, Integer> slabMap, Map<Integer, Integer> productCategoryMap, List<ShoppingCart> carts) {
		
		List<Bill> billPerItem = new ArrayList<Bill>();
		Double totalAmount = 0d;
		Bill tempBill = null;
		for(ShoppingCart temp:carts){
			tempBill = new Bill();
			tempBill.setItemId(temp.getItemID());
			tempBill.setName(temp.getItemName());
			tempBill.setCategory(temp.getItemCategoryID());
			tempBill.setPercDiscPerItem(Double.valueOf(productCategoryMap.get(Integer.parseInt(temp.getItemCategoryID()))));
			tempBill.setUnitPrice(temp.getUnitPrice());
			tempBill.setQuantity(temp.getQuantity());
			
			Double amount = ((Double.valueOf(temp.getUnitPrice()) * Double.valueOf(temp.getQuantity())) 
					* (1-((tempBill.getPercDiscPerItem())/100)));
			
			tempBill.setPerDiscForItem(amount);
			billPerItem.add(tempBill);
			totalAmount=totalAmount + amount;
			
		}
		System.out.println("Before applying final discount:" + totalAmount);
		if(totalAmount<=3000){
			totalAmount -= (totalAmount/100)*slabMap.get(3000);
		}else if(totalAmount>3000 && totalAmount<=7000){
			totalAmount -= (totalAmount/100)*slabMap.get(7000);
		}else if(totalAmount>7000 && totalAmount<=9000){
			totalAmount -= (totalAmount/100)*slabMap.get(9000);
		}
		return totalAmount;
	}
 
}
