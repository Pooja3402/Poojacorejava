package com.networkbill.mainclasses;

import com.networkbill.classes.Airtel;
import com.networkbill.classes.BillGenerator;
import com.networkbill.classes.Idea;

public class MainBillGenerator {
	
	public static void main(String[] args) {
		
		Airtel airtel = new Airtel();
		System.out.println("Your mobile bill is "+ airtel.generateBill(150));

		airtel.method1();
		BillGenerator.method2();
	
	
	   Idea idea = new Idea();
	   System.out.println("Your mobile bill is "+ idea.generateBill(150));
	   
	}
}
