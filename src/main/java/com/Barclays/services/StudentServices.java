package com.Barclays.services;

import com.Barclays.entitiy.Student;

import java.util.List;

public interface StudentServices {
    public boolean addStudentDetails(Student std);
    public List<Student>getAllStudentDetails();
    public Student getStdDetails(long id);
}
