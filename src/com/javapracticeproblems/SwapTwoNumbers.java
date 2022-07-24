package com.javapracticeproblems;
import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		int firstNum ,secondNum;
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter fisrt number : ");
		firstNum = userInput.nextInt();
		
		System.out.println("Enter Second number : ");
		secondNum = userInput.nextInt();
		System.out.println("Numbers Before Swaping firstNumber is " + firstNum +" Second Number " + secondNum  );
		userInput.close();
		
		int tempNum;
		tempNum = firstNum;
		firstNum = secondNum;
		secondNum = tempNum;
		System.out.println("Numbers After Swaping firstNumber is " + firstNum +" Second Number " + secondNum  );
	}
}
