package com.crossasyst.demo.controller;


import com.crossasyst.demo.model.Employee;
import com.crossasyst.demo.service.EmployeeService;
import com.crossasyst.demo.model.EmployeeResponse;
import com.crossasyst.demo.entity.EmployeeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path = "/employees/{employeeId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<EmployeeEntity> getEmployee(@PathVariable Long employeeId) {
        EmployeeEntity employeeEntity = employeeService.getEmployee(employeeId);
        return new ResponseEntity<>(employeeEntity, HttpStatus.OK);

    }

    @PostMapping(value = "/employees", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<EmployeeResponse> createEmployee(@RequestBody Employee employee) {
        EmployeeResponse employeeResponse = employeeService.createEmployee(employee);
        return new ResponseEntity<EmployeeResponse>(employeeResponse, HttpStatus.OK);
    }

   /* @PutMapping("{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable int id,@RequestBody Employee employee) {

        Employee employee1=new Employee(employee.getFirstName(), employee.getLastName());

        updateEmployee(id,employee).setFirstName(employee1.getFirstName());
        updateEmployee(id, employee).setLastName(employee1.getLastName());


        employeeRepository.save(updateEmployee);

        return ResponseEntity.ok(updateEmployee);
    }*/

}
