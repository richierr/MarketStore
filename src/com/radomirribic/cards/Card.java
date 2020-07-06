package com.radomirribic.cards;

public abstract class Card {
	
	double turnover;
	double  initialDiscountRate;
	
	
	public abstract double calculateDiscount(double purchaseValue);
	public abstract String calculateDiscountRate();
	
	

	public double getTurnover() {
		return turnover;
	}


	public Card(double turnover, double initialDiscountRate) {
		super();
		this.turnover = turnover;
		this.initialDiscountRate = initialDiscountRate;
	}
	
	
	
	
	
	

}
