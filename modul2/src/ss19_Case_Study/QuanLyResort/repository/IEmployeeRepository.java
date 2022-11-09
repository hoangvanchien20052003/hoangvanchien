package ss19_Case_Study.QuanLyResort.service;

import ss19_Case_Study.QuanLyResort.model.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> findALls();

    void addEmployee(Employee employee);

    void editEmployee(Employee employee);

}
