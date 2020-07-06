package com.radomirribic.cards;

public class Silver extends Card {

	public Silver(double turnover) {
		super(turnover, 2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateDiscount(double purchaseValue) {
		if (turnover <= 300) {
			return purchaseValue * 0.02;
		} else {
			return purchaseValue * 0.035;
		}

	}

	@Override
	public String calculateDiscountRate() {
		if (turnover <= 300) {
			return "2.0%";
		} else {
			return "3.5%";
		}

	}

}
