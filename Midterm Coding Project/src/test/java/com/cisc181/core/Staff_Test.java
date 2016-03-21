package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
		
	}
	
	@Test
	public void test() {
		ArrayList<Staff> StaffList = new ArrayList<Staff>();
		
		Staff staff1 = new Staff(eTitle.MR);
		Staff staff2 = new Staff(eTitle.MRS);
		Staff staff3 = new Staff(eTitle.MR);
		Staff staff4 = new Staff(eTitle.MS);
		Staff staff5 = new Staff(eTitle.MR);
		
		staff1.setSalary(100);
		staff2.setSalary(200);
		staff3.setSalary(300);
		staff4.setSalary(400);
		staff5.setSalary(500);
		
		StaffList.add(staff1);
		StaffList.add(staff2);
		StaffList.add(staff3);
		StaffList.add(staff4);
		StaffList.add(staff5);
		
		double Average = 0;
		for(Staff s : StaffList){
			Average += s.getSalary();
		}
		Average = Average / 5;
		assertEquals(Average,300);
	}	

	@Test
	public void PhoneExceptionTest() throws PersonException{
		try{
			Staff s = new Staff("Mike", "J", "Meehan", new Date(2000,12,12), "address", "973525", "mjmeehan@udel.edu", "3 to 5", 5, 6, new Date(2000,12,11), eTitle.MR);
		}
		catch(PersonException e){
			assertTrue(true);
			
		}
	}

	@Test
	public void DateExceptionTest() throws PersonException{
		try{
		Staff s = new Staff("Mike", "J", "Meehan", new Date(20000,12,12), "address", "973-222-2222", "mjmeehan@udel.edu", "3 to 5", 5, 6, new Date(2000000,12,11), eTitle.MR);
		}
		catch(PersonException e){
			assertTrue(true);
		}
	
	}
}
