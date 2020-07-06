package com.radomirribic.app;

import com.radomirribic.cards.Card;
import com.radomirribic.cards.CardFactory;
import com.radomirribic.purchases.Purchase;

public class MarketStoreApp {

	public static void main(String[] args) {
		
		CardFactory cardFactory=CardFactory.get_instance();
		Card bronze =cardFactory.createCard(0, "bronze");
		Purchase p1=new Purchase(bronze, 150);
		p1.printPurchaseDetails();
		
		
		Card silver =cardFactory.createCard(600, "silver");
		Purchase p2=new Purchase(silver, 850);
		p2.printPurchaseDetails();
		
		
		Card gold =cardFactory.createCard(1500, "gold");
		Purchase p3=new Purchase(gold, 1300);
		p3.printPurchaseDetails();
		
		
		
		
		

	}

}
