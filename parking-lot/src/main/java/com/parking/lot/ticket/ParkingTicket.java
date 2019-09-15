package com.parking.lot.ticket;

import java.time.LocalDateTime;

import com.parking.lot.constants.ParkingTicketStatus;

public class ParkingTicket {
	private String ticketNumber;
	private LocalDateTime issuedAt;
	private LocalDateTime payedAt;
	private double payedAmount;
	private ParkingTicketStatus status;
	public String getTicketNumber() {
		return ticketNumber;
	}
	public void setTicketNumber(String ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	public LocalDateTime getIssuedAt() {
		return issuedAt;
	}
	public void setIssuedAt(LocalDateTime issuedAt) {
		this.issuedAt = issuedAt;
	}
	public LocalDateTime getPayedAt() {
		return payedAt;
	}
	public void setPayedAt(LocalDateTime payedAt) {
		this.payedAt = payedAt;
	}
	public double getPayedAmount() {
		return payedAmount;
	}
	public void setPayedAmount(double payedAmount) {
		this.payedAmount = payedAmount;
	}
	public ParkingTicketStatus getStatus() {
		return status;
	}
	public void setStatus(ParkingTicketStatus status) {
		this.status = status;
	}
	
	
}
