package com.JavaTraining_09092015;

public class DuplicateCharactersTest {

	public static void main(String[] args) {
	String testString = "available";  //value being tested
	String dupString; //returned string of duplicates
	DuplicateCharacters stringDuplicateTest = new DuplicateCharacters();
	
	stringDuplicateTest.setRefString(testString);
	
	dupString = stringDuplicateTest.findDuplicates();
	
	System.out.println("The repeated letters in " + testString + " are " + dupString);
	}

}
