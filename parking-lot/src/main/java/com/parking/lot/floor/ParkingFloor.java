package com.parking.lot.floor;

import java.util.HashMap;

import com.parking.lot.display.board.ParkingDisplayBoard;
import com.parking.lot.domain.CustomerInfoPanel;
import com.parking.lot.spots.ParkingSpot;
import com.parking.lot.vehicles.Vehicle;

public class ParkingFloor {
	private String name;
	private HashMap<String, ParkingSpot> handicappedSpots;
	private HashMap<String, ParkingSpot> compactSpots;
	private HashMap<String, ParkingSpot> largeSpots;
	private HashMap<String, ParkingSpot> motorbikeSpots;
	private HashMap<String, ParkingSpot> electricSpots;

	private HashMap<String, CustomerInfoPanel> infoPortals;

	private ParkingDisplayBoard parkingDisplayBoard;
	private int freeElectricSpotCount;
	private int freeCompactSpotCount;
	private int freeLargeSpotCount;
	private int freeMotorbikeSpotCount;

	public ParkingFloor(String name) {
		this.name = name;
	}

	public void addParkingSpot(ParkingSpot spot) {
		switch (spot.getType()) {
		case HANDICAPPED:
			handicappedSpots.put(spot.getNumber(), spot);
			break;
		case COMPACT:
			compactSpots.put(spot.getNumber(), spot);
			break;
		case LARGE:
			largeSpots.put(spot.getNumber(), spot);
			break;
		case MOTORBIKE:
			motorbikeSpots.put(spot.getNumber(), spot);
			break;
		case ELECTRIC:
			electricSpots.put(spot.getNumber(), spot);
			break;
		default:
			System.out.println("Wrong parking spot type!");
		}
	}

	public void assignVehicleToSpot(Vehicle vehicle, ParkingSpot spot) {
		spot.assignVehicle(vehicle);
		switch (spot.getType()) {
		case HANDICAPPED:
			updateDisplayBoardForHandicapped(spot);
			break;
		case COMPACT:
			// updateDisplayBoardForCompact(spot);
			break;
		case LARGE:
			// updateDisplayBoardForLarge(spot);
			break;
		case MOTORBIKE:
			// updateDisplayBoardForMotorbike(spot);
			break;
		case ELECTRIC:
			// updateDisplayBoardForElectric(spot);
			break;
		default:
			System.out.println("Wrong parking spot type!");
		}
	}

	private void updateDisplayBoardForHandicapped(ParkingSpot spot) {
		if (this.parkingDisplayBoard.getHandicappedFreeSpot().getNumber() == spot.getNumber()) {
			for (String key : handicappedSpots.keySet()) {
				if (handicappedSpots.get(key).isFree()) {
					this.parkingDisplayBoard.setHandicappedFreeSpot(handicappedSpots.get(key));
					break;
				}
			}

		}
		this.parkingDisplayBoard.showEmptySpotNumber();
	}

	public void freeSpot(ParkingSpot spot) {
		spot.removeVehicle();
		switch (spot.getType()) {
		case HANDICAPPED:
			freeElectricSpotCount++;
			break;
		case COMPACT:
			freeCompactSpotCount++;
			break;
		case LARGE:
			freeLargeSpotCount++;
			break;
		case MOTORBIKE:
			freeMotorbikeSpotCount++;
			break;
		case ELECTRIC:
			freeElectricSpotCount++;
			break;
		default:
			System.out.println("Wrong parking spot type!");
		}
	}
}
