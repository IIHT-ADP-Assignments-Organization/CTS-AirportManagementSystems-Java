package com.airportManagement.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


import com.airportManagement.models.HangerDetails;
import com.airportManagement.models.PilotDetails;
import com.airportManagement.models.PlaneDetails;


public class TestBoundary {
	
	 @Test
	    public void testMobileNumberLength()
	    {
		
		 PilotDetails pilotDetails = new PilotDetails();
		 HangerDetails hangerDetails = new HangerDetails();
	        		
	        long mobileNumberLength=10;
	        
	        assertEquals(mobileNumberLength,pilotDetails.getMobileNo());
	        assertEquals(mobileNumberLength,hangerDetails.getMobileNo());
	    }
	 
	 @Test
	    public void testLicenseNoLength()
	    {
		 PilotDetails pilotDetails = new PilotDetails();
				
			int minChar=10;
	        boolean licenseNoLength=(pilotDetails.getLicenseNo()==minChar);
	      
	        assertEquals( licenseNoLength,pilotDetails.getLicenseNo());

	    }

	 @Test
	    public void testPilotAddressPinNoLength()
	    {
		 
		 PlaneDetails planeDetails = new PlaneDetails();
		 PilotDetails pilotDetails = new PilotDetails();
		 HangerDetails hangerDetails = new HangerDetails();		
			int minChar=7;
	        boolean pinNoLength=(pilotDetails.getLicenseNo()==minChar);
	       
	        assertEquals( pinNoLength,pilotDetails.getPinNo());
	       
	    }
	 @Test
	    public void testOwnerPinNoLength()
	    {
		 
		 PlaneDetails planeDetails = new PlaneDetails();
		 PilotDetails pilotDetails = new PilotDetails();
		 HangerDetails hangerDetails = new HangerDetails();		
			int minChar=7;
			 boolean pinNoLength=(planeDetails.getPinNo()==minChar);
	       
	        assertEquals( pinNoLength,planeDetails.getPinNo());
	       
	    }
	 
	 
	 @Test
	    public void testManagerPinNoLength()
	    {
		 
		
		 HangerDetails hangerDetails = new HangerDetails();		
			int minChar=7;
			 boolean pinNoLength=(hangerDetails.getPinNo()==minChar);
	       
	        assertEquals( pinNoLength,hangerDetails.getPinNo());
	       
	    }
	 
}
