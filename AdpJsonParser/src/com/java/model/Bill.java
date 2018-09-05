package com.java.model;

public class Bill {

	String itemId;
	String category;
	String name;
	String quantity;
	String unitPrice;
	Double percDiscPerItem;
	Double perDiscForItem;
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}
	public Double getPercDiscPerItem() {
		return percDiscPerItem;
	}
	public void setPercDiscPerItem(Double percDiscPerItem) {
		this.percDiscPerItem = percDiscPerItem;
	}
	public Double getPerDiscForItem() {
		return perDiscForItem;
	}
	public void setPerDiscForItem(Double perDiscForItem) {
		this.perDiscForItem = perDiscForItem;
	}
	@Override
	public String toString() {
		return "Bill [itemId=" + itemId + ", category=" + category + ", name=" + name + ", quantity=" + quantity
				+ ", unitPrice=" + unitPrice + ", percDiscPerItem=" + percDiscPerItem + ", perDiscForItem="
				+ perDiscForItem + "]";
	}
	
	
	
	
}
