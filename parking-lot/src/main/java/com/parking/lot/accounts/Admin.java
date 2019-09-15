package com.parking.lot.accounts;

import com.parking.lot.display.board.ParkingDisplayBoard;
import com.parking.lot.domain.CustomerInfoPanel;
import com.parking.lot.domain.EntrancePanel;
import com.parking.lot.domain.ExitPanel;
import com.parking.lot.floor.ParkingFloor;
import com.parking.lot.spots.ParkingSpot;

public class Admin extends Account {
	public boolean addParkingFloor(ParkingFloor floor) {
		return true;
	}
	
	public boolean addParkingSpot(String floorName, ParkingSpot spot){
		return true;
	}
	
	public boolean addParkingDisplayBoard(String floorName, ParkingDisplayBoard board){
		return true;
	}
	
	public boolean addCustomerInfoPanel(String floorName, CustomerInfoPanel infoPanel){
		return true;
	}
	
	public boolean addEntrancePanel(EntrancePanel entrancePanel){
		return true;
	}
	
	public boolean addExitPanel(ExitPanel exitPanel){
		return true;
	}
}
