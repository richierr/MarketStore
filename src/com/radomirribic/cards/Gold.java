package com.radomirribic.cards;

public class Gold extends Card {

	public Gold(double turnover) {
		super(turnover, 2);

	}

	@Override
	public double calculateDiscount(double purchaseValue) {
		if (turnover < 100) {
			return purchaseValue * (initialDiscountRate / 100d);
		} else {
			double discount = 2;
			int howManyTimes = ((int) turnover) / 100 - 1;
			while (howManyTimes > -1 && discount < 10) {
				discount++;
				howManyTimes--;
			}

			return purchaseValue * (discount / 100d);
		}

	}

	@Override
	public String calculateDiscountRate() {
		if (turnover < 100) {
			return "2%";
		} else {
			double discount = 2;
			int howManyTimes = ((int) turnover) / 100 - 1;
			while (discount < 10 && howManyTimes > -1) {
				discount++;
				howManyTimes--;
			}

			String rez = discount + "%";
			return rez;
		}

	}

}
