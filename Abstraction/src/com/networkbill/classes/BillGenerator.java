package com.networkbill.classes;

public interface BillGenerator {
	
	public abstract float generateBill(int internateUsage);
	
//	public void showMessage();
//	
//	abstract void method ();
//	
	public default void method1() {
		System.out.println("Hello");
		method4();
	}
	
	public static void method2() {
		System.out.println("This is static method.");
	}
	
	private void method4() {
		System.out.println("Private method.");
	}

}
