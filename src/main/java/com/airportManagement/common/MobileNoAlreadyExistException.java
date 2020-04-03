package com.airportManagement.common;

public class MobileNoAlreadyExistException extends Exception {
	
	public static  String message="Mobile No already exists !..";


	public MobileNoAlreadyExistException()
	{
		
	}
	public MobileNoAlreadyExistException(String message)
	{
		this.message=message;
	}


}
