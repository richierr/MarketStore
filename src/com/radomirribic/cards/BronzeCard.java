package com.radomirribic.cards;

public class BronzeCard extends Card {

	public BronzeCard(double turnover) {
		super(turnover, 0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateDiscount(double purchaseValue) {
		if (turnover < 100) {
			return 0.00;
		} else if (turnover >= 100 && turnover <= 300) {
			return purchaseValue * 0.01;
		} else {
			return purchaseValue * 0.025;
		}

	}

	@Override
	public String calculateDiscountRate() {
		if (turnover < 100) {
			return "0.0%";
		} else if (turnover >= 100 && turnover <= 300) {
			return "1.0%";
		} else {
			return "2.5%";

		}

	}

}
