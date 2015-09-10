package com.AugTraining08262015;

import com.AugTraining08262015.Person;
import com.AugTraining08262015.Obj.*;

public class PersonTest{

	public static void main(String[] args) {
		//Instantiate person with an age
		Person Rob = new Person(21);
		
		//Set name
		Rob.setFirstName("Robert");
		
		//output Person variables
		System.out.println(Rob.getFirstName() + " is " + Rob.getAge() + " years old.");
		
		//create vehicle
		Car RobCar = new Car("Car");
		
		//output Car variables
		System.out.println(Rob.getFirstName() + " is using a " + RobCar.getVehicleType());
		System.out.print(Rob.getFirstName() +"'s " + RobCar.getVehicleType() + RobCar.driveForward());
	}

}
