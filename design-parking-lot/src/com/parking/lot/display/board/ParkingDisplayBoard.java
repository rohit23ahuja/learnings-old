package com.parking.lot.display.board;

import com.parking.lot.spots.CompactSpot;
import com.parking.lot.spots.ElectricSpot;
import com.parking.lot.spots.HandicappedSpot;
import com.parking.lot.spots.LargeSpot;
import com.parking.lot.spots.MotorbikeSpot;
import com.parking.lot.spots.ParkingSpot;

public class ParkingDisplayBoard {
	private String id;
	private ParkingSpot handicappedFreeSpot;
	private ParkingSpot compactFreeSpot;
	private ParkingSpot largeFreeSpot;
	private ParkingSpot motorbikeFreeSpot;
	private ParkingSpot electricFreeSpot;
	public ParkingSpot getHandicappedFreeSpot() {
		return handicappedFreeSpot;
	}
	public void setHandicappedFreeSpot(ParkingSpot handicappedFreeSpot) {
		this.handicappedFreeSpot = handicappedFreeSpot;
	}
	public ParkingSpot getCompactFreeSpot() {
		return compactFreeSpot;
	}
	public void setCompactFreeSpot(ParkingSpot compactFreeSpot) {
		this.compactFreeSpot = compactFreeSpot;
	}
	public ParkingSpot getLargeFreeSpot() {
		return largeFreeSpot;
	}
	public void setLargeFreeSpot(ParkingSpot largeFreeSpot) {
		this.largeFreeSpot = largeFreeSpot;
	}
	public ParkingSpot getMotorbikeFreeSpot() {
		return motorbikeFreeSpot;
	}
	public void setMotorbikeFreeSpot(ParkingSpot motorbikeFreeSpot) {
		this.motorbikeFreeSpot = motorbikeFreeSpot;
	}
	public ParkingSpot getElectricFreeSpot() {
		return electricFreeSpot;
	}
	public void setElectricFreeSpot(ParkingSpot electricFreeSpot) {
		this.electricFreeSpot = electricFreeSpot;
	}
	public String getId() {
		return id;
	}
	
	public void showEmptySpotNumber() {
	    String message = "";
	    if(handicappedFreeSpot.isFree()){
	      message += "Free Handicapped: " + handicappedFreeSpot.getNumber();
	    } else {
	      message += "Handicapped is full";
	    }
	    message += System.lineSeparator();

	    if(compactFreeSpot.isFree()){
	      message += "Free Compact: " + compactFreeSpot.getNumber();
	    } else {
	      message += "Compact is full";
	    }
	    message += System.lineSeparator();

	    if(largeFreeSpot.isFree()){
	      message += "Free Large: " + largeFreeSpot.getNumber();
	    } else {
	      message += "Large is full";
	    }
	    message += System.lineSeparator();

	    if(motorbikeFreeSpot.isFree()){
	      message += "Free Motorbike: " + motorbikeFreeSpot.getNumber();
	    } else {
	      message += "Motorbike is full";
	    }
	    message += System.lineSeparator();

	    if(electricFreeSpot.isFree()){
	      message += "Free Electric: " + electricFreeSpot.getNumber();
	    } else {
	      message += "Electric is full";
	    }

	    System.out.println(message);
	  }	

}
