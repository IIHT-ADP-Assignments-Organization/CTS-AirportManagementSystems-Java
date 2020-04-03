package com.airportManagement.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.airportManagement.models.Booking;
import com.airportManagement.models.HangerDetails;
import com.airportManagement.models.PilotDetails;
import com.airportManagement.models.PlaneDetails;
import com.airportManagement.services.AdminService;
import com.airportManagement.services.ManagerService;


public class TestFunctional {
	
	@Test
	public void tesForAddPlane() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("hotelManagement-application.xml");
	
	PlaneDetails planeDetails = new PlaneDetails();
	planeDetails.setManufacturerName("Airbus");
	planeDetails.setRegisterNo(101);
	planeDetails.setModelNo(12345);
	planeDetails.setPlaneName("AirIndia");
	planeDetails.setCapacity(500);
	planeDetails.setEmail("airindia@gmail.com");
	planeDetails.setHouseNo(23);
	planeDetails.setAddressLine1("peenya");
	planeDetails.setCity("Benglore");
	planeDetails.setState("Karnataka");
	planeDetails.setCountry("India");
	planeDetails.setPinNo(560052);

	AdminService adminservice=(AdminService) context.getBean("adminService");
	boolean planefromdb=adminservice.addPlane(planeDetails);
	assertSame(planeDetails,planefromdb);
	
}
	
	@Test
	public void tesForAddPilot() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("hotelManagement-application.xml");
	
	PilotDetails pilotDetails = new PilotDetails();
	pilotDetails.setPilotName("john");
	pilotDetails.setLicenseNo(1234567789);
	pilotDetails.setSocialSecurityNo(122);
	pilotDetails.setGender("male");
	pilotDetails.setMobileNo(1234567891);
	pilotDetails.setEmailAddress("john@gmail.com");
	pilotDetails.setHouseNo(34);
	pilotDetails.setAddressLine1("rajajinagar");
	pilotDetails.setCity("benglore");
	pilotDetails.setState("Karnataka");
	pilotDetails.setCountry("India");
	pilotDetails.setPinNo(563421);
	

	AdminService adminservice=(AdminService) context.getBean("adminService");
	boolean pilotfromdb=adminservice.addPilot(pilotDetails);
	assertSame(pilotDetails,pilotfromdb);
	
}
	
	@Test
	public void tesForAddHanger() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("hotelManagement-application.xml");
	
	HangerDetails hangerDetails = new HangerDetails();
	hangerDetails.setHangerLocation("HAL airport");
	hangerDetails.setHangerCapacity(15);
	hangerDetails.setManagerName("sham");
	hangerDetails.setSocialSecurityNo(125);
	hangerDetails.setGender("male");
	hangerDetails.setMobileNo(314567234);
	hangerDetails.setEmail("sham@gmail.com");
	hangerDetails.setHouseNo(53);
	hangerDetails.setAddressLine1("Jalahalli");
	hangerDetails.setCity("benglore");
	hangerDetails.setState("Karnataka");
	hangerDetails.setCountry("India");
	hangerDetails.setPinNo(563728);
	
	

	AdminService adminservice=(AdminService) context.getBean("adminService");
	boolean hangerfromdb=adminservice.addHangerDetails(hangerDetails);
	assertSame(hangerDetails,hangerfromdb);
	
}
	
	@Test

	public void testSearchFlight() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("hotelManagement-application.xml");	
		Booking booking = new Booking();
		
		
		ManagerService managerService=(ManagerService) context.getBean("managerService");
		HangerDetails hangerfromdb = managerService.searchHanger(booking.getFromDate(),booking.getToDate());
		Assert.assertNotNull(hangerfromdb);
		
		
	}
	
	@Test
	public void testTicketBooking()
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("hotelManagement-application.xml");	Booking booking = new Booking();
		Booking bookings = new Booking();
	
	
		ManagerService managerService=(ManagerService) context.getBean("managerService");
	boolean isAllocatedPlane =managerService.allocatePlane(bookings);
	assertEquals(bookings,isAllocatedPlane);
	
	}
	
	public void testGetHangerStatus() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring-application.xml");
		HangerDetails hangerDetails = new HangerDetails();
		Booking booking = new Booking();
		
		ManagerService managerService=(ManagerService) context.getBean("managerService");
		Booking hangerStatus =managerService.getHangerStatus(booking.getFromDate(),booking.getToDate(),booking.getHangerNumber());
		assertEquals(booking,hangerStatus);
	}
	
}
