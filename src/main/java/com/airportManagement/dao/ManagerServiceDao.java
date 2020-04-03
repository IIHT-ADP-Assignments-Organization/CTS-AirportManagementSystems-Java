package com.airportManagement.dao;

import java.util.Date;

import com.airportManagement.models.Booking;
import com.airportManagement.models.HangerDetails;

public interface ManagerServiceDao {

	HangerDetails searchHanger(Date fromDate,Date toDate);
	boolean allocatePlane(Booking booking);
	Booking getHangerStatus(Date fromDate,Date toDate,int hangerNumber);
	
}
