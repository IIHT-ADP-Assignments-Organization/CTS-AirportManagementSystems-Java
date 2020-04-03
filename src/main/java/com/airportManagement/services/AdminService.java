package com.airportManagement.services;

import com.airportManagement.models.HangerDetails;
import com.airportManagement.models.PilotDetails;
import com.airportManagement.models.PlaneDetails;

public interface AdminService {
	
	boolean addPlane(PlaneDetails planeDetails);
	boolean addPilot(PilotDetails pilotDetails);
	boolean addHangerDetails(HangerDetails hangerDetails);

}
