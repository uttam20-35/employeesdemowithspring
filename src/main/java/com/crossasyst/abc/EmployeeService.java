package com.crossasyst.abc;

import com.crossasyst.demo.model.Employee;
import com.crossasyst.demo.model.EmployeeResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@Log4j2
public class EmployeeService {
    public Employee getEmployee(Long employeeId) {
        Employee employee = new Employee("Tejas", "Bhoir");
        return employee;
    }

    public EmployeeResponse createEmployee(Employee employee) {
        int id = new Random().nextInt();
        EmployeeResponse employeeResponse = new EmployeeResponse();
        employeeResponse.setId(id);
        //log.info(employee1.getFirstName(),employee1.getLastName());
        log.info("Employee Name is {} {}", employee.getFirstName(), employee.getLastName());
        return employeeResponse;
    }
}
