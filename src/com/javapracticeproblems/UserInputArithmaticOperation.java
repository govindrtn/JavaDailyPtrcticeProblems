package com.javapracticeproblems;

import java.util.Scanner;


public class UserInputArithmaticOperation {
	public static void main(String[] args) {
		
System.out.println("Integer");
System.out.println();
		

		Scanner userinput = new Scanner(System.in);
		
		System.out.println("Enter first integer value : ");
		int a = userinput.nextInt();
		System.out.println("Enter second integer value : ");
		int b = userinput.nextInt();
		userinput.close();
		

				
		int add = a + b ; //// Add
		int sub = a - b ; //// Sub
		int mul = a * b ; //// Mul
		int div = a / b;  //// div
		
		System.out.println(a+ " + " + b + " Addition---> "  + add);
		System.out.println(a+ " - " + b + " Subtraction----> " + sub);
		System.out.println(a+ " * " + b + " Mul----> " + mul);
		System.out.println(a+ " / " + b + " Div ----> " + div);
		
//		Float
		System.out.println("Float");
		System.out.println();
		System.out.println("Enter first float value : ");
		float a1 = userinput.nextFloat();
		System.out.println("Enter Second float value : ");
		float b1 = userinput.nextFloat();
		
		float add1 = a1 + b1 ; //// Add
		float sub1 = a1 - b1 ; //// Sub
		float mul1 = a1 * b1 ; //// Mul
		float div1 = a1 / b1 ; //// Div
		
		System.out.println(a1+ " + " + b1 + " Addition---> " + add1);
		System.out.println(a1+ " - "  + b1 + " Subtraction----> " + sub1);
		System.out.println(a1+ " * " + b1 + " Mul----> " + mul1);
		System.out.println(a1+ " / " + b1 + " Div ----> " + div1);		
	}

}
