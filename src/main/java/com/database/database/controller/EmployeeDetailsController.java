package com.database.database.controller;

import com.database.database.entity.EmployeeDetails;
import com.database.database.service.EmployeeDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Controller
public class EmployeeDetailsController {
    private final EmployeeDetailsService employeeService;

    public EmployeeDetailsController(EmployeeDetailsService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/create")
    public String save(@RequestBody EmployeeDetails employee) {
        employeeService.saveData(employee);
        return "1 row created";
    }
    @GetMapping("/employee/all")
    public List<EmployeeDetails> getAll() {
        return employeeService.getAllEmployee();
    }

    @PutMapping("/Update/{id}")
    public void update(@PathVariable Integer id, @RequestBody EmployeeDetails employeeDetails) {
        employeeService.updateData(id, employeeDetails);
    }
    @DeleteMapping("/Delete/{id}")
    public String delete(@PathVariable Integer id) {
        employeeService.deleteData(id);
        return "Id " + id + " successfully Deleted.";
    }
}
