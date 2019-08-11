package com.parking.lot;

import java.util.HashMap;

import com.parking.lot.constants.VehicleType;
import com.parking.lot.domain.EntrancePanel;
import com.parking.lot.domain.ExitPanel;
import com.parking.lot.domain.ParkingRate;
import com.parking.lot.floor.ParkingFloor;
import com.parking.lot.ticket.ParkingTicket;
import com.parking.lot.vehicles.Vehicle;

public class ParkingLot {
	private String name;
	// private Location addres;
	private ParkingRate parkingRate;

	private int compactSpotCount;
	private final int maxCompactCount;

	private HashMap<String, EntrancePanel> entrancePanels;
	private HashMap<String, ExitPanel> exitPanels;
	private HashMap<String, ParkingFloor> parkingFloors;

	// all active parking tickets, identified by their ticketNumber
	private HashMap<String, ParkingTicket> activeTickets;

	// singleton ParkingLot to ensure only one object of ParkingLot in the
	// system,
	// all entrance panels will use this object to create new parking ticket:
	// getNewParkingTicket(),
	// similarly exit panels will also use this object to close parking tickets
	private static ParkingLot parkingLot = null;

	// private constructor to restrict for singleton
	private ParkingLot() {
		maxCompactCount = 100;
		// 1. initialize variables: read name, address and parkingRate from
		// database
		// 2. initialize parking floors: read the parking floor map from
		// database,
		// this map should tell how many parking spots are there on each floor.
		// This
		// should also initialize max spot counts too.
		// 3. initialize parking spot counts by reading all active tickets from
		// database
		// 4. initialize entrance and exit panels: read from database
	}

	// static method to get the singleton instance of StockExchange
	public static ParkingLot getInstance() {
		if (parkingLot == null) {
			parkingLot = new ParkingLot();
		}
		return parkingLot;
	}
	
	  // note that the following method is 'synchronized' to allow multiple entrances
	  // panels to issue a new parking ticket without interfering with each other
	  public synchronized ParkingTicket getNewParkingTicket(Vehicle vehicle) throws Exception {
	    if (this.isFull(vehicle.getType())) {
	      throw new Exception();
	    }
	    ParkingTicket ticket = new ParkingTicket();
	    vehicle.assignTicket(ticket);
	    //ticket.saveInDB();
	    // if the ticket is successfully saved in the database, we can increment the parking spot count
	    this.incrementSpotCount(vehicle.getType());
	    this.activeTickets.put(ticket.getTicketNumber(), ticket);
	    return ticket;
	  }

	private boolean isFull(VehicleType type) {
		// TODO Auto-generated method stub
		return false;
	}

	private void incrementSpotCount(VehicleType type) {
		// TODO Auto-generated method stub
		
	}
}
