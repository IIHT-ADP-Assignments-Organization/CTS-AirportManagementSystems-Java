package com.airportManagement.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.airportManagement.dao.AdminServiceDao;
import com.airportManagement.models.HangerDetails;
import com.airportManagement.models.PilotDetails;
import com.airportManagement.models.PlaneDetails;

@Component
@Service ("adminService")
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminServiceDao adminServiceDao;
	@Transactional
	public boolean addPlane(PlaneDetails planeDetails) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public boolean addPilot(PilotDetails pilotDetails) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public boolean addHangerDetails(HangerDetails hangerDetails) {
		// TODO Auto-generated method stub
		return false;
	}

}
