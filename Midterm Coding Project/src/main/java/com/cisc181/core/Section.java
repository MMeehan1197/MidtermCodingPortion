package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Section extends Course{

	private UUID SectionID;
	private int RoomID;
	
	
	//no-arg constructor
	public Section() {
		super();
	}

	//Constructor with a no-arg superclass Constructor
	public Section(UUID sectionID, int roomID) {
		super();
		SectionID = sectionID;
		RoomID = roomID;
	}

	//Constructor with a full superclass Constructor
	public Section(UUID semesterID, Date startDate, Date endDate, String courseName, int gradePoints, eMajor major,
			UUID sectionID, int roomID) {
		super(semesterID, startDate, endDate, courseName, gradePoints, major);
		SectionID = UUID.randomUUID();
		RoomID = roomID;
	}

	public UUID getSectionID() {
		return SectionID;
	}

	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}

	public int getRoomID() {
		return RoomID;
	}

	public void setRoomID(int roomID) {
		RoomID = roomID;
	}
	
	
	
	
}
