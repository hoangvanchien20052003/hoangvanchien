package hs_gv.reponsitory;

import hs_gv.model.Student;

import java.util.List;

public interface IStudentReponsitory {
    void addStudent(Student student);
    List<Student> findAll();

    void removeStudent(String ma);
}
