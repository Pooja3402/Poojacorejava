package com.sbp.abstraction.billgenarator.classes;

public abstract class Bill {
	
	private int number;
	private final float PI;
	
	public Bill(int number) {
		PI =number;
	}
	
//	public Bill(int number) {
//		this.number=number;
//	}
	
	public abstract float generateBill(int units);
	

}
