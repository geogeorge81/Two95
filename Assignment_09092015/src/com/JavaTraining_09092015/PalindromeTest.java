package com.JavaTraining_09092015;

public class PalindromeTest {
	
	public static void main(String[] args){
		
	Palindrome palTest = new Palindrome();
	String origString = "abcba";
	
	palTest.setRefString(origString);
	
	
	if(palTest.CheckPalindrome()==true){
		System.out.println(origString + " is a palindrome.");
	}
	else
		System.out.println(origString + " is not a palindrome.");
	}

}
	