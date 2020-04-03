package com.airportManagement.common;

public class LicenseNoAlreadyExistException extends Exception {
	
	public static  String message="License No already exists !..";


	public LicenseNoAlreadyExistException()
	{
		
	}
	public LicenseNoAlreadyExistException(String message)
	{
		this.message=message;
	}

}
