package com.application.mercadopago_java.application;

import com.application.mercadopago_java.domain.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
    Employee save(Employee employee);
}
