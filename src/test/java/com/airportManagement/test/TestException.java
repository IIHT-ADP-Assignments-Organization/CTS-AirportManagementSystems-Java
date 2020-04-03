package com.airportManagement.test;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.airportManagement.common.EmailAlreadyExistException;
import com.airportManagement.common.HouseNoAndCityAlreadyExistException;
import com.airportManagement.common.LicenseNoAlreadyExistException;
import com.airportManagement.common.MobileNoAlreadyExistException;
import com.airportManagement.common.SocialSecurityNoAlreadyExistException;
import com.airportManagement.models.HangerDetails;
import com.airportManagement.models.PilotDetails;
import com.airportManagement.models.PlaneDetails;
import com.airportManagement.services.AdminService;


import junit.framework.Assert;

public class TestException {

	@Test
	 public void testForEmailAlreadyExist() throws EmailAlreadyExistException
   
    {
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("couponbank-application.xml");
	
	 PlaneDetails planeDetails = new PlaneDetails();
	 PilotDetails pilotDetails = new PilotDetails();
	 HangerDetails hangerDetails = new HangerDetails();
		
		
	 AdminService adminservice=(AdminService) context.getBean("adminService");
	 adminservice.addPlane(planeDetails);
	 adminservice.addPilot(pilotDetails);
	 adminservice.addHangerDetails(hangerDetails);
	 
Assert.assertEquals(EmailAlreadyExistException.message," email already exists !");
    }
	
	@Test
	 public void testForHouseNoAndCityAlreadyExist() throws HouseNoAndCityAlreadyExistException
   {
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("couponbank-application.xml");
	
	 PlaneDetails planeDetails = new PlaneDetails();
	 PilotDetails pilotDetails = new PilotDetails();
	 HangerDetails hangerDetails = new HangerDetails();
		
		
	 AdminService adminservice=(AdminService) context.getBean("adminService");
	 adminservice.addPlane(planeDetails);
	 adminservice.addPilot(pilotDetails);
	 adminservice.addHangerDetails(hangerDetails);
	 
Assert.assertEquals(HouseNoAndCityAlreadyExistException.message," email already exists !");
   }
	
	@Test
	 public void testForLicenseNoAlreadyExist() throws LicenseNoAlreadyExistException
  {
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("couponbank-application.xml");
	
	 PlaneDetails planeDetails = new PlaneDetails();
	 PilotDetails pilotDetails = new PilotDetails();
	 HangerDetails hangerDetails = new HangerDetails();
		
		
	 AdminService adminservice=(AdminService) context.getBean("adminService");
	 adminservice.addPlane(planeDetails);
	 adminservice.addPilot(pilotDetails);
	 adminservice.addHangerDetails(hangerDetails);
	 
Assert.assertEquals(LicenseNoAlreadyExistException.message," email already exists !");
  }
	
	@Test
	 public void testForMobileNoAlreadyExist() throws MobileNoAlreadyExistException
 {
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("couponbank-application.xml");
	
	 PlaneDetails planeDetails = new PlaneDetails();
	 PilotDetails pilotDetails = new PilotDetails();
	 HangerDetails hangerDetails = new HangerDetails();
		
		
	 AdminService adminservice=(AdminService) context.getBean("adminService");
	 adminservice.addPlane(planeDetails);
	 adminservice.addPilot(pilotDetails);
	 adminservice.addHangerDetails(hangerDetails);
	 
Assert.assertEquals(MobileNoAlreadyExistException.message," email already exists !");
 }
	
	@Test
	 public void testForSocialSecurityNoAlreadyExist() throws SocialSecurityNoAlreadyExistException
{
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("couponbank-application.xml");
	
	 PlaneDetails planeDetails = new PlaneDetails();
	 PilotDetails pilotDetails = new PilotDetails();
	 HangerDetails hangerDetails = new HangerDetails();
		
		
	 AdminService adminservice=(AdminService) context.getBean("adminService");
	 adminservice.addPlane(planeDetails);
	 adminservice.addPilot(pilotDetails);
	 adminservice.addHangerDetails(hangerDetails);
	 
Assert.assertEquals(SocialSecurityNoAlreadyExistException.message," email already exists !");
}
	
	
}
