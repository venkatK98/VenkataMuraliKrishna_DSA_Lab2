package com.lab02.paymoney;

//To test the Possible Scenarios for the Problem Statement

public class TestTarget{
	public static void main(String[] args) {
	       
        test(new int[] {20, 12, 31}, 19);
        test(new int[] {100}, 101);
        test(new int[] {20, 70, 9}, 101);  
        test(new int[] {5, 20, 32, 12}, 57);
        test(new int[] {5, 20, 32, 12}, 58);        
    }
   
    static void test(int[] transactions, int dailyTarget) {
       
        System.out.println("----------------------");
        TargetDeterminator determinator = new TargetDeterminator(transactions, dailyTarget);
        determinator.determine();
    }

}
