package ss19_Case_Study.QuanLyResort.service;

import ss19_Case_Study.QuanLyResort.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();

    void addCustomer(Customer customer);

    void editCustomer(Customer customer);

}
