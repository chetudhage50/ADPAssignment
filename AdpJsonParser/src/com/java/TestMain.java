package com.java;

import java.util.List;
import java.util.Map;

import com.java.model.ShoppingCart;
import com.java.service.impl.BillingServiceImpl;
import com.java.service.impl.FlatSlabDiscountImpl;
import com.java.service.impl.ProductCategoryServiceImpl;
import com.java.service.impl.ShoppingCartServiceImpl;

public class TestMain {
 public static void main(String[] args){
     
    FlatSlabDiscountImpl discount = new FlatSlabDiscountImpl();
    Map<Integer,Integer> slabMap = discount.prepareSlabsMap();
    
    ProductCategoryServiceImpl impl = new ProductCategoryServiceImpl();
    Map<Integer,Integer> productCategoryMap = impl.prepareProductCategoryMap();
    
    ShoppingCartServiceImpl cartServiceImpl = new ShoppingCartServiceImpl();
    List<ShoppingCart> carts = cartServiceImpl.getShoppingCartItemList();
    
    BillingServiceImpl billingServiceImpl = new BillingServiceImpl();
    Double amount = billingServiceImpl.calculateBill(slabMap,productCategoryMap,carts);
    System.out.println(amount);
    
    

 }
}
