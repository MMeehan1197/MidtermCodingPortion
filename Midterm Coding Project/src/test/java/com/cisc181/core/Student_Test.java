package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {

	@BeforeClass
	public static void setup() {
		ArrayList<Course> CourseRecords = new ArrayList<Course>();
		ArrayList<Semester> SemesterRecords = new ArrayList<Semester>();
		ArrayList<Section> SectionRecords = new ArrayList<Section>();
		ArrayList<Student> StudentRecords = new ArrayList<Student>();
	
		CourseRecords.add(new Course("Chemistry", 3, eMajor.CHEM));
		CourseRecords.add(new Course("Nursing", 3, eMajor.NURSING));
		CourseRecords.add(new Course("Business", 3, eMajor.BUSINESS));

		SemesterRecords.add(new Semester(UUID.randomUUID(), new Date(2000,11,11), new Date(2000,11,12)));
		SemesterRecords.add(new Semester(UUID.randomUUID(), new Date(2001,11,11), new Date(2001,11,12)));
		
		SectionRecords.add(new Section(UUID.randomUUID(), 1));
		SectionRecords.add(new Section(UUID.randomUUID(), 2));
		SectionRecords.add(new Section(UUID.randomUUID(), 3));
		SectionRecords.add(new Section(UUID.randomUUID(), 1));
		SectionRecords.add(new Section(UUID.randomUUID(), 2));
		SectionRecords.add(new Section(UUID.randomUUID(), 3));

	}

	@Test
	public void test() {
		assertEquals(1, 1);
	}
}