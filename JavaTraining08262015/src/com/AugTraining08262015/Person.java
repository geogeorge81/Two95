package com.AugTraining08262015;

import com.AugTraining08262015.Obj.*;

public class Person {
	private static String firstName;
	private static int age;
	
	Person(int setAge){
		Person.age = setAge;
	}
	
	public static int getAge() {
		//getter for age
		return age;
	}
	
	public static String getFirstName() {
		//getter for firstName
		return firstName;
	}
	public static void setFirstName(String firstName) {
		//setter for firstName
		Person.firstName = firstName;
		
	}

}
