package com.parking.lot.spots;

import com.parking.lot.constants.ParkingSpotType;
import com.parking.lot.vehicles.Vehicle;

public abstract class ParkingSpot {
	private String number;
	private boolean free;
	private Vehicle vehicle;
	private final ParkingSpotType type;

	public ParkingSpot(ParkingSpotType type) {
		this.type = type;
	}
	
	public boolean assignVehicle(Vehicle vehicle){
		this.vehicle=vehicle;
		free=false;
		return true;
	}
	
	public boolean removeVehicle(){
		this.vehicle=null;
		free=true;
		return free;
	}

	public String getNumber() {
		return number;
	}

	public boolean isFree() {
		return free;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public ParkingSpotType getType() {
		return type;
	}
	
	
}
