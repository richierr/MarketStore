package com.radomirribic.cards;

public class CardFactory {

	private static CardFactory single_instance = null;

	private CardFactory() {

	}

	public static CardFactory get_instance() {
		if (single_instance == null)
			single_instance = new CardFactory();
		return single_instance;
	}

	public Card createCard(double turnover, String name) {
		try {
			if (name.equalsIgnoreCase("bronze")) {
				return new BronzeCard(turnover);
			} else if (name.equalsIgnoreCase("silver")) {
				return new Silver(turnover);
			} else if (name.equalsIgnoreCase("gold")) {
				return new Gold(turnover);
			} else {
				throw new NoSuchcardException();
			}

		} catch (NoSuchcardException e) {
			System.out.println(e);
			return null;
		}

	}

}
