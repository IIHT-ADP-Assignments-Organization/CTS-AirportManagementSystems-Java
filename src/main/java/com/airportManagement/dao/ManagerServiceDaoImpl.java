package com.airportManagement.dao;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.airportManagement.models.Booking;
import com.airportManagement.models.HangerDetails;

@Component
@Service ("managerService")
public class ManagerServiceDaoImpl implements ManagerServiceDao {

	@Autowired
	@Transactional
	public HangerDetails searchHanger(Date fromDate, Date toDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public boolean allocatePlane(Booking booking) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public Booking getHangerStatus(Date fromDate, Date toDate, int hangerNumber) {
		// TODO Auto-generated method stub
		return null;
	}

}
