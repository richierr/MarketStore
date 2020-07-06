package com.radomirribic.purchases;

import java.text.DecimalFormat;

import com.radomirribic.cards.BronzeCard;
import com.radomirribic.cards.Card;
import com.radomirribic.cards.Gold;
import com.radomirribic.cards.Silver;

public class Purchase {
	private static int purchaseId;
	private Card card;
	private double purchaseValue;

	public Purchase(Card card, double purchaseValue) {
		super();
		purchaseId++;
		this.card = card;
		this.purchaseValue = purchaseValue;
	}

	public void printPurchaseDetails() {

		DecimalFormat df = new DecimalFormat("#.##");
		StringBuilder st = new StringBuilder();
		st.append(purchaseId).append(". ");
		if (card instanceof BronzeCard) {
			st.append("Bronze:");
		} else if (card instanceof Silver) {
			st.append("Silver:");
		} else {
			st.append("Gold:");
		}
		st.append("\n");
		st.append("\ta. Mock data: turnover $").append(card.getTurnover()).append(", purchase value $")
				.append(purchaseValue).append(";");
		st.append("\n");
		st.append("\tb. Output:");
		st.append("\n").append("\n");
		st.append("\t• Purchase value: $").append(purchaseValue);
		st.append("\n").append("\n");
		st.append("\t• Discount rate: ").append(card.calculateDiscountRate());
		st.append("\n").append("\n");
		st.append("\t• Discount: $").append(df.format(card.calculateDiscount(purchaseValue)));
		st.append("\n").append("\n");
		st.append("\t• Total: $").append(df.format(purchaseValue - card.calculateDiscount(purchaseValue)));
		st.append("\n").append("\n");
		System.out.println(st.toString());

	}

}
