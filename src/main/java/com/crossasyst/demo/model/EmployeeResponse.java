package com.crossasyst.demo.model;

import lombok.Data;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

@Data
public class EmployeeResponse {

    private int id;

}
