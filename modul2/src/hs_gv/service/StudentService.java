package hs_gv.service;

import hs_gv.model.Student;
import hs_gv.reponsitory.IStudentReponsitory;
import hs_gv.reponsitory.StudentReponsitory;

import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService{
    private IStudentReponsitory iStudentReponsitory = new StudentReponsitory();
    public void addStudent(Student student) {
        iStudentReponsitory.addStudent(student);
    }

    public List<Student> findAll(){
        return iStudentReponsitory.findAll();
    }

    @Override
    public void removeStudent(String ma) {
        iStudentReponsitory.removeStudent(ma);
    }
}

