package hs_gv.service;

import hs_gv.model.Student;

import java.util.List;

public interface IStudentService {
    void addStudent(Student student);
    List<Student> findAll();
    void removeStudent(String ma);
}
