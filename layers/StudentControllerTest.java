package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentControllerTest {
	private StudentService service;
	private StudentController controller;
	
	@BeforeEach
	public void setup() {
		service = mock(StudentService.class);
		controller = new StudentController(service);
	}

	@Test
	void testAddStudent() {
		Student student = new Student(300, "Yash", "MBA");
		doNothing().when(service).add(student);
		controller.start();
		
		verify(service, times(1)).add(any(Student.class));
	}

}
