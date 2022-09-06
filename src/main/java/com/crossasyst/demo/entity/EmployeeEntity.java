package com.crossasyst.demo.entity;

import com.crossasyst.demo.model.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.scheduling.support.SimpleTriggerContext;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class EmployeeEntity
{
    private int id;
    private String firstName;
    private String lastName;
}
