package com.crossasyst.demo.service;

import com.crossasyst.demo.model.Employee;
import com.crossasyst.demo.model.EmployeeResponse;
import com.crossasyst.demo.entity.EmployeeEntity;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
@Log4j2
public class EmployeeService {

    private List<EmployeeEntity> employeeEntities;
    EmployeeEntity empEntity;

    public EmployeeService() {
        employeeEntities = List.of((new EmployeeEntity(100, "Uttam", "Thakare")),
                (new EmployeeEntity(101, "Prem", "Patil")),
                (new EmployeeEntity(102, "Kunal", "Dinkar")),
                (new EmployeeEntity(103, "Vaibhav", "Jadhav")));
        //Old Way to create and insert List
       /* employeeEntities.add(new EmployeeEntity(101, "Prem", "Patil"));
        employeeEntities.add(new EmployeeEntity(102, "Kunal", "Dinkar"));
        employeeEntities.add(new EmployeeEntity(103, "Vaibhav", "Jadhav"));
        employeeEntities.add(new EmployeeEntity(104, "Rakesh", "Chavan"));
        employeeEntities.add(new EmployeeEntity(105, "Suchit", "Khadatar"));*/
    }

    public EmployeeEntity getEmployee(Long employeeId) {

       /* EmployeeEntity employeeEntity=null;

        Optional<EmployeeEntity> optionalEmployeeEntity =employeeEntities.stream().filter(i->i.getId()==employeeId).findFirst();
        if ()*/

        //Employee employee = new Employee("Tejas", "Bhoir");

        EmployeeEntity employeeEntity = null;

        for (EmployeeEntity e : employeeEntities) {
            if (e.getId() == employeeId) {
                employeeEntity = e;
                break;
            }
        }
        return employeeEntity;
    }

    public EmployeeResponse createEmployee(Employee employee) {

        int id = new Random().nextInt();
        EmployeeResponse employeeResponse = new EmployeeResponse();
        employeeResponse.setId(id);
        //log.info(employee1.getFirstName(),employee1.getLastName());
        log.info("Employee Name is {} {}", employee.getFirstName(), employee.getLastName());
        return employeeResponse;
    }


   /*
    public Employee updateEmployee(Long employeeId) {

    }*/
}
