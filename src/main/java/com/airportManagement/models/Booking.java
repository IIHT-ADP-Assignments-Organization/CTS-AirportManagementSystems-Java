package com.airportManagement.models;

import java.util.Date;

public class Booking {
	
	Date fromDate;
	Date toDate;
	int hangerNumber;
	int hangerLocation;
	int planeId;
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	public int getHangerNumber() {
		return hangerNumber;
	}
	public void setHangerNumber(int hangerNumber) {
		this.hangerNumber = hangerNumber;
	}
	public int getHangerLocation() {
		return hangerLocation;
	}
	public void setHangerLocation(int hangerLocation) {
		this.hangerLocation = hangerLocation;
	}
	public int getPlaneId() {
		return planeId;
	}
	public void setPlaneId(int planeId) {
		this.planeId = planeId;
	}
	
	

}
