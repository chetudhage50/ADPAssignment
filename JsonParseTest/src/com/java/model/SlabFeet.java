package com.java.model;

import java.util.ArrayList;
import java.util.List;

public class SlabFeet {
	 
	    private List<Slab> slabs = new ArrayList<Slab>();

		public List<Slab> getSlabs() {
			return slabs;
		}

		public void setSlabs(List<Slab> slabs) {
			this.slabs = slabs;
		}

		@Override
		public String toString() {
			return "SlabFeet [slabs=" + slabs + "]";
		}

		
	 }
