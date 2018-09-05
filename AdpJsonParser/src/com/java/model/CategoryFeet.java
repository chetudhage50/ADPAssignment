package com.java.model;

import java.util.ArrayList;
import java.util.List;

public class CategoryFeet {
	 
	    private List<Category> category = new ArrayList<Category>();

		public List<Category> getCategory() {
			return category;
		}

		public void setCategory(List<Category> category) {
			this.category = category;
		}

		@Override
		public String toString() {
			return "CategoryFeet [category=" + category + "]";
		}

		
		
	 }
