package com.sbp.abstraction.billgenarator.mainclasses;

import com.sbp.abstraction.billgenarator.classes.Bill;
import com.sbp.abstraction.billgenarator.classes.IndustrialBill;
import com.sbp.abstraction.billgenarator.classes.ResidentialBill;

public class MainBill {

	public static void main(String[] args) {
		Bill bill = new IndustrialBill(50);
		
		Bill bill1 = new IndustrialBill(50);
		float amount = bill.generateBill(100);
		System.out.println("Your electricity bill is "+amount);
		System.out.println("Your electricity bill is "+bill1.generateBill(60));
//		System.out.println("Your electricity bill is "+bill.generateBill(100));
		
		Bill rbill = new ResidentialBill(50);
		System.out.println("Your residential bill is "+rbill.generateBill(50));
		

	}

}
