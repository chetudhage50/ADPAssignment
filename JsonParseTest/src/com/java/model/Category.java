package com.java.model;

public class Category {
 private String id;
 private String name;
 private String discPerc;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDiscPerc() {
	return discPerc;
}
public void setDiscPerc(String discPerc) {
	this.discPerc = discPerc;
}
@Override
public String toString() {
	return "Category [id=" + id + ", name=" + name + ", discPerc=" + discPerc + "]";
}
 
 
}
