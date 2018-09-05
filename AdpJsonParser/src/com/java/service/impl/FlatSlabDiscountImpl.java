package com.java.service.impl;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.java.model.Slab;
import com.java.model.SlabFeet;
import com.java.service.FlatSlabDiscount;
import com.java.util.Constants;

public class FlatSlabDiscountImpl  implements FlatSlabDiscount{
	public Map<Integer,Integer> prepareSlabsMap(){
		 String filePath = Constants.FLAT_SLAB_DISCOUNT_FILE;
			ObjectMapper mapper = new ObjectMapper();
			SlabFeet slabs = null;
			Map<Integer,Integer> slabMap = new HashMap<Integer,Integer>();
		    try {
		    	slabs = mapper.readValue(new File(filePath), SlabFeet.class);
		    	
		    	for(Slab slab : slabs.getSlabs()){
		    		if(!slabMap.containsKey(slab.getRangeMax())){
		    			slabMap.put(Integer.parseInt(slab.getRangeMax()), Integer.parseInt(slab.getDiscPerc()));
		    		}
		    	}
		    	
		    	System.out.println(slabMap.size());
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
			return slabMap;   
	}
	
}
