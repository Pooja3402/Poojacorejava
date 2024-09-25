package com.sbp.abstraction.billgenarator.classes;

public class IndustrialBill extends Bill {
	
	public IndustrialBill(int number) {
		super(number);
	}
	
	@Override
	public float generateBill(int units) {
		float amount = units*16.30f;
		return amount;
		
//		return units*16.30f;
	}

}
