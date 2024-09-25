package com.abstraction;

public abstract class Transaction {
	
	private int bal;
	
	public Transaction(int bal) {
		this.bal=bal;
		
	}
	
//	public void creditAmount(int amount) {
//		bal+=amount;           //bal = bal + amount;
//	}
//	
//	public void debitAmount(int amount) {
//		bal-=amount;
//	}
	
	
	public abstract void creditAmount(float amount);
	public abstract void debitAmount(float amount);

}
