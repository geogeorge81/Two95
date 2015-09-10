/**
 * 
 */
package com.AugTraining08262015.Obj;

/**
 * @author Geo
 *
 */
public class Airplane extends Vehicle {
	private String vehicleType;
	
	Airplane(String setVehicleType){
		vehicleType = setVehicleType;
	}
	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String driveForward(){
		return(" is moving forward");
		
	}
	
	public String driveReverse(){
		return(" is moving backward");

	}
	
	public String driveTurn(){
		return(" is turning");

	}

	public String embarkPassenger(){
		return(" is embarking a passenger");

	}
	
	public String disembarkPassenger(){
		return(" is disembarking a passenger");

	}
}
