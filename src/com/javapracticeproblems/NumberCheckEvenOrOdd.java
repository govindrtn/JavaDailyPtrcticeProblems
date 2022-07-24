package com.javapracticeproblems;

import java.util.Scanner;

public class NumberCheckEvenOrOdd {
	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter a number to check Even or Odd : ");
		int num = userInput.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("Number is Even : " + num);
		}
		else {
			System.out.println("Number is Odd : " + num);
		}	
	}
}
