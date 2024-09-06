package com.Barclays.services;

import com.Barclays.entitiy.Student;
import com.Barclays.repositiory.StudentReposititory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentServices{
@Autowired
private StudentReposititory studentReposititory;
    @Override
    public boolean addStudentDetails(Student std) {
        boolean status=false;
        try{
            studentReposititory.save(std);
            status=true;
        }
        catch (Exception e){
            e.printStackTrace();
            status=false;
        }
        return status;
    }

    @Override
    public List<Student> getAllStudentDetails() {
        return studentReposititory.findAll();
    }

    @Override
    public Student getStdDetails(long id) {
        Optional<Student>optional=studentReposititory.findById(id);
        if(optional.isPresent()){
           return optional.get();
        }
        return null;
    }
}
