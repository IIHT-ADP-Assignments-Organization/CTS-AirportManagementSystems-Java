package com.airportManagement.dao;

import com.airportManagement.models.HangerDetails;
import com.airportManagement.models.PilotDetails;
import com.airportManagement.models.PlaneDetails;

public interface AdminServiceDao {
	
	boolean addPlane(PlaneDetails planeDetails);
	boolean addPilot(PilotDetails pilotDetails);
	boolean addHangerDetails(HangerDetails hangerDetails);


}
