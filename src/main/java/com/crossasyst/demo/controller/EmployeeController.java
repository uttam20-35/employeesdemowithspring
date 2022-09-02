package com.crossasyst.demo.controller;


import com.crossasyst.demo.model.Employee;
import com.crossasyst.abc.EmployeeService;
import com.crossasyst.demo.model.EmployeeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    @GetMapping(value = "/employees/{employeeId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Employee> getEmployee(@PathVariable Long employeeId) {
        Employee emp = employeeService.getEmployee(101L);
        return new ResponseEntity<>(emp, HttpStatus.OK);

    }

    @PostMapping(value = "/employees", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<EmployeeResponse> createEmployee(@RequestBody Employee employee) {
        EmployeeResponse employeeResponse = employeeService.createEmployee(employee);
        return new ResponseEntity<EmployeeResponse>(employeeResponse, HttpStatus.OK);
    }

}
