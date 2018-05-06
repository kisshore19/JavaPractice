package com.kishore.java.core.designpatterns.template;

public abstract class OrderProcessTemplate {
	public boolean isGift;

	public abstract void doSelect();

	public abstract void doPayment();

	public final void giftWrap() {
		System.out.println("Gift wrap done.");
	}

	public abstract void doDelivery();

	public final void processOrder() { // Actual template method is this, it will take of execution order
		doSelect();
		doPayment();
		if (isGift) {
			giftWrap();
		}
		doDelivery();
	}
}