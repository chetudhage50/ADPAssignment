package com.java.service.impl;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.java.model.Category;
import com.java.model.CategoryFeet;
import com.java.service.ProductCategoryService;
import com.java.util.Constants;

public class ProductCategoryServiceImpl implements ProductCategoryService{
	public Map<Integer,Integer> prepareProductCategoryMap(){
		String filePath = Constants.PRODUCT_CATEGORY_FILE;
		ObjectMapper mapper = new ObjectMapper();
		CategoryFeet categories = null;		
		Map<Integer,Integer> productCategoryMap = new HashMap<Integer,Integer>();
		try {
			categories = mapper.readValue(new File(filePath), CategoryFeet.class);

			for(Category category: categories.getCategory()){
				if(!productCategoryMap.containsKey(category.getId())){
					productCategoryMap.put(Integer.parseInt(category.getId()), Integer.parseInt(category.getDiscPerc()));
				}
			}

			System.out.println(productCategoryMap.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return productCategoryMap;   
	}
}
