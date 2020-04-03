package com.airportManagement.services;

import java.util.Date;

import com.airportManagement.models.Booking;
import com.airportManagement.models.HangerDetails;
import com.airportManagement.models.PlaneDetails;

public interface ManagerService {
	
	HangerDetails searchHanger(Date fromDate,Date toDate);
	boolean allocatePlane(Booking booking);
	Booking getHangerStatus(Date fromDate,Date toDate,int hangerNumber);
	

}
