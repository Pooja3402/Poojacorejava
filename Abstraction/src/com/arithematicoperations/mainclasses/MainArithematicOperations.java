package com.arithematicoperations.mainclasses;

import com.arithematicoperations.interfaces.ArithematicOperations;

public class MainArithematicOperations {

	public static void main(String[] args) {
		ArithematicOperations addition = new ArithematicOperations() {
			
			@Override
			public int doOperation (int operand1, int operand2) {
				return operand1 + operand2;
			}
			
			public int doSubstraction(int a, int b) {
				return a - b;
			}
			
			public int doMultiplication(int p, int s) {
				return p * s;
			}
			
			public int doDivision(int x, int y) {
				return x / y;
			}
			
		};
		
		System.out.println("This is the addition result is: "+addition.doOperation(15, 10));
		System.out.println("TJis is the substraction result is: "+addition.doSubstraction(50, 10));
		System.out.println("This is the multiplication result is: "+addition.doMultiplication(5, 3));
		System.out.println("This is th division result is: "+addition.doDivision(80, 5));
		
	}

}
