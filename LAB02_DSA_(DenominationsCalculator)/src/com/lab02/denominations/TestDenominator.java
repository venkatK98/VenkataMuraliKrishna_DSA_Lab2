package com.lab02.denominations;

//To test the Possible Scenarios for the Problem Statement

public class TestDenominator {
	public static void main(String[] args) {
        test(new int[] {5, 1, 10}, 12);
        test(new int[] {60, 5, 12, 78, 25}, 128);
        test(new int[] {12, 5, 123, 18}, 158);
        test(new int[] {12, 5, 123, 18}, 159);
        test(new int[] {12, 5, 123, 18}, 160);
        test(new int[] {5, 0, 10}, 12);
    }
   
    private static void test(int[] denominations, int paymentAmount) {
       
        System.out.println("--------------------------------------");
        DenominationCalculator calculator =
            new DenominationCalculator(denominations, paymentAmount);
        calculator.calculate();
       
    }

}
