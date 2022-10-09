package com.psa.checkin.dto;

public class ReservationUpdateRequest {
	
	private Long id;
	private int numberofBags;
	private boolean checkInStatus;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getNumberofBags() {
		return numberofBags;
	}
	public void setNumberofBags(int numberofBags) {
		this.numberofBags = numberofBags;
	}
	public boolean isCheckInStatus() {
		return checkInStatus;
	}
	public void setCheckInStatus(boolean checkInStatus) {
		this.checkInStatus = checkInStatus;
	}
	
	

}
