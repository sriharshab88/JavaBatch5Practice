package com.javaPractice.oopsConcepts.Enacpsulation;

public class ItemsList {

	private String ledTelevision;
	private String samsungMobile;
	private String vegetables;
	private float tvPrice;
	private int mobilePrice;
	private int vegetablePrice;
	
	
	public String getLEDTelevision() {
		ledTelevision = "45inch LG";
		return ledTelevision;
	}
	public String getSamsungMobile() {
		samsungMobile = "New Galaxy S";
		return samsungMobile;
	}
	public String getVegetables() {
		vegetables = "Potato";
		return vegetables;
	}
	
	
	public void setTvPrice(int tvPrice) {
		this.tvPrice = tvPrice;
		System.out.println(this.tvPrice);
	}
	public void setMobilePrice(int mobilePrice) {
		this.mobilePrice = mobilePrice;
		System.out.println(this.mobilePrice);
	}
	public void setVegetablePrice(int vegetablePrice) {
		this.vegetablePrice = vegetablePrice;
		System.out.println(this.vegetablePrice);
	}
	
	
	
	
	
	
	
	
	
	
}
