package com.Barclays;

import com.Barclays.entitiy.Student;
import com.Barclays.services.StudentServiceImpl;
import com.Barclays.services.StudentServices;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class CrudOperationApplication {

	public static void main(String[] args)
	{
		ApplicationContext context=SpringApplication.run(CrudOperationApplication.class, args);
		StudentServices stdService=context.getBean(StudentServiceImpl.class);

// ------------------insert operation-------------------
//		Student std=new Student();
//		std.setName("andre");
//		std.setRollNo(101);
//		std.setMarks(93.5f);
//
//		boolean status=stdService.addStudentDetails(std);
//		if(status){
//			System.out.println("Student inserted successfully");
//
//		}
//		else {
//			System.out.println("Student not inserted due to some error");
//		}

		//-----------select operation 1-------------
//	List<Student>stdList= stdService.getAllStudentDetails();
//	for(Student std:stdList)
//	{
//		System.out.println("ID :"+std.getId());
//		System.out.println("Name :"+std.getName());
//		System.out.println("ROllNo :"+std.getRollNo());
//		System.out.println("Marks :"+std.getMarks());
//		System.out.println("--------------------------------------");
//	}
		//-----------select opertion 2------------
		Student std=stdService.getStdDetails(1L);
		System.out.println("ID :"+std.getId());
		System.out.println("Name :"+std.getName());
    	System.out.println("ROllNo :"+std.getRollNo());
		System.out.println("Marks :"+std.getMarks());
	}


}
