package com.javapracticeproblems;

import java.util.Scanner;

public class QuotientRemainder {
	public static void main(String[] args) {
		 
		Scanner userinput = new Scanner(System.in);
		
		System.out.println("Enter first number : ");
		int dividend  = userinput.nextInt();
		System.out.println("Enter second number : ");
		int divisor = userinput.nextInt();
		userinput.close();
		
		int quotient = dividend / divisor;
		int remainder = dividend % divisor;
		
		System.out.println("Quotient is ---> : " + quotient);
		System.out.println("Quotient is ---> : " + remainder);	
	}
}
