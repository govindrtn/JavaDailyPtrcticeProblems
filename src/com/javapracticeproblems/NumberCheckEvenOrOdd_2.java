package com.javapracticeproblems;

import java.util.Scanner;

public class NumberCheckEvenOrOdd_2 {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter a number to check Even or Odd : ");
		int num = userInput.nextInt();
		
		String EvenOdd = (num % 2 ==0 ) ? "EVEN_Number" : "ODD_Number";
		
		System.out.println(num + " is " + EvenOdd );
	}
}
