package com.javapracticeproblems;

public class VowelConsonant_2 {

	public static void main(String[] args) 
	{		
		char character = 'r';
		switch (character) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(character + " is Vowel");
			break;
		default:
			System.out.println(character + " is Consonant");
		}
	}
}
