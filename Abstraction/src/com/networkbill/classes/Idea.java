package com.networkbill.classes;

public class Idea implements BillGenerator {

	@Override
	public float generateBill(int internateUsage) {
		return internateUsage * 9;
	}

}
