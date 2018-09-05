package com.java.model;

public class Slab {
	private String rangeMin;
	private String rangeMax;
	private String discPerc;
	public String getRangeMin() {
		return rangeMin;
	}
	public void setRangeMin(String rangeMin) {
		this.rangeMin = rangeMin;
	}
	public String getRangeMax() {
		return rangeMax;
	}
	public void setRangeMax(String rangeMax) {
		this.rangeMax = rangeMax;
	}
	public String getDiscPerc() {
		return discPerc;
	}
	public void setDiscPerc(String discPerc) {
		this.discPerc = discPerc;
	}
	@Override
	public String toString() {
		return "Slab [rangeMin=" + rangeMin + ", rangeMax=" + rangeMax + ", discPerc=" + discPerc + "]";
	}


}
