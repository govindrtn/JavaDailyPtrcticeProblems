package com.javapracticeproblems;

import java.util.Scanner;

public class SwapTwoNumber_2 {

	public static void main(String[] args) {
		
int firstNum ,secondNum;
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter fisrt number : ");
		firstNum = userInput.nextInt();
		
		System.out.println("Enter Second number : ");
		secondNum = userInput.nextInt();
		System.out.println("Numbers Before Swaping firstNumber is " + firstNum +" Second Number " + secondNum  );
		userInput.close();
		
		firstNum = firstNum - secondNum;
		secondNum =  firstNum + secondNum;
		firstNum = secondNum - firstNum;
		
		System.out.println("Numbers After Swaping firstNumber is " + firstNum +" Second Number " + secondNum  );
	}	
	
}
