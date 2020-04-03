package com.airportManagement.common;

public class EmailAlreadyExistException extends Exception {
	
	public static  String message="Email already exists !..";


	public EmailAlreadyExistException()
	{
		
	}
	public EmailAlreadyExistException(String message)
	{
		this.message=message;
	}


}
