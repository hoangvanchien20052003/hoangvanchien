package hs_gv.reponsitory;

import hs_gv.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentReponsitory implements IStudentReponsitory{
    private static List<Student> studentList;

    static {
        studentList = new ArrayList<>();
        studentList.add(new Student("chien",20,"nam","abc","12A",9.8));
        studentList.add(new Student("nhi",30,"nam","xad","12A",8));
        studentList.add(new Student("hoang",10,"nam","cca","12",7.8));
        studentList.add(new Student("hien",5,"nam","lol","12",7.8));
    }
    @Override
    public void addStudent(Student student) {
        studentList.add(student);
    }

    public List<Student> findAll(){
        return studentList;
    }

    @Override
    public void removeStudent(String ma) {
        int index = studentList.indexOf(new Student(ma));
        if(index != -1){
            studentList.remove(index);
        }
        else {
            System.out.println("ma khong hop le");
        }
    }
}
