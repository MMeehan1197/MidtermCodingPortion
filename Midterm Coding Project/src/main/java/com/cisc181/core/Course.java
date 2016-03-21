package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Course extends Semester{

	private UUID CourseID;
	protected String CourseName;
	private int GradePoints;
	private eMajor Major;
	
	public eMajor getMajor() {
		return Major;
	}

	public void setMajor(eMajor major) {
		Major = major;
	}
	
	//no-arg constructor
	public Course() {
		super();
	}

	//Constructor with an empty Semester constructor
	public Course(String courseName, int gradePoints, eMajor major) {
		super();
		CourseName = courseName;
		GradePoints = gradePoints;
		Major = major;
		CourseID = UUID.randomUUID();
	}

	//Constructor with a normal Semester constructor
	public Course(UUID semesterID, Date startDate, Date endDate, String courseName, int gradePoints, eMajor major) {
		super(semesterID, startDate, endDate);
		CourseName = courseName;
		GradePoints = gradePoints;
		Major = major;
	}


	

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	public int getGradePoints() {
		return GradePoints;
	}

	public void setGradePoints(int gradePoints) {
		GradePoints = gradePoints;
	}

	public UUID getCourseID() {
		return CourseID;
	}
	
	
	
}
