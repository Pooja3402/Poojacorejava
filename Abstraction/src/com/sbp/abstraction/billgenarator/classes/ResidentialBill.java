package com.sbp.abstraction.billgenarator.classes;

public class ResidentialBill extends Bill {
	
	public ResidentialBill(int number) {
		super(number);
	}
	
	@Override
	public float generateBill(int units) {
		float amount = units*7.30f;
		return amount;
	}
}
