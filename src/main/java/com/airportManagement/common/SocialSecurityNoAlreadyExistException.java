package com.airportManagement.common;

public class SocialSecurityNoAlreadyExistException extends Exception {
	
	public static  String message="SSN No already exists !..";


	public SocialSecurityNoAlreadyExistException()
	{
		
	}
	public SocialSecurityNoAlreadyExistException(String message)
	{
		this.message=message;
	}

}
