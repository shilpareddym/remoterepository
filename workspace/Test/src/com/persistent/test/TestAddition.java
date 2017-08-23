package com.persistent.test;

public class TestAddition {
	
	public static void main(String[] args){
		
		//int number = Integer.parseInt(args[0]);
		float number = 123.4f;
		float sum = 0;
		System.out.println("number ="+ number);
		while(number > 0){
			sum = sum+number % 10;
			number = number/10;
		}
		
		System.out.println(" : Sum =: "+sum);
		
		
	}

}
