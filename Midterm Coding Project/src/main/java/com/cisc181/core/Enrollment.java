package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	
	public double getGrade() {
		return Grade;
	}

	public void setGrade(double grade) {
		Grade = grade;
	}

	public UUID getSectionID() {
		return SectionID;
	}

	public UUID getStudentID() {
		return StudentID;
	}

	public UUID getEnrollmentID() {
		return EnrollmentID;
	}

	public Enrollment() {
		super();
		this.EnrollmentID = UUID.randomUUID();
	}

	public Enrollment(UUID sectionID, UUID studentID, double grade) {
		super();
		this.Grade = grade;
		SectionID = sectionID;
		StudentID = studentID;
		this.EnrollmentID = UUID.randomUUID();
	}
	
	
	
}
