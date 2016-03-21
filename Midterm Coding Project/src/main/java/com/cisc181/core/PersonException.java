package com.cisc181.core;

import java.util.Date;

public class PersonException extends Exception{

	public PersonException(){
		super();
	}
	
	public PersonException(Person p){
		Date DOB = p.getDOB();
		
	}
}
