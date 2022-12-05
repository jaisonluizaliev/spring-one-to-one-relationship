package com.example.demo.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

  @Autowired
  private EmployeeRepository employee_repository;

  @GetMapping("/list-all")
  public Iterable<Employee> listAllEmployees() {
    return employee_repository.findAll();
  }

  @PostMapping("/post-new")
  public Employee postNewEmployee(@RequestBody Employee obj) {
    return employee_repository.save(obj);

  }

}
