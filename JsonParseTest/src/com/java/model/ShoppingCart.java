package com.java.model;

import java.util.ArrayList;

public class ShoppingCart {

private String itemID ;
private String itemCategoryID ;
private String itemName ;
private String unitPrice;	
private String quantity ;
public String getItemID() {
	return itemID;
}
public void setItemID(String itemID) {
	this.itemID = itemID;
}
public String getItemCategoryID() {
	return itemCategoryID;
}
public void setItemCategoryID(String itemCategoryID) {
	this.itemCategoryID = itemCategoryID;
}
public String getItemName() {
	return itemName;
}
public void setItemName(String itemName) {
	this.itemName = itemName;
}
public String getUnitPrice() {
	return unitPrice;
}
public void setUnitPrice(String unitPrice) {
	this.unitPrice = unitPrice;
}
public String getQuantity() {
	return quantity;
}
public void setQuantity(String quantity) {
	this.quantity = quantity;
}
@Override
public String toString() {
	return "ShoppingCart [itemID=" + itemID + ", itemCategoryID=" + itemCategoryID + ", itemName=" + itemName
			+ ", unitPrice=" + unitPrice + ", quantity=" + quantity + "]";
}
    	
}
