package com.database.database.controller;

import com.database.database.dto.EmployeeDetailsDto;
import com.database.database.entity.EmployeeDetails;
import com.database.database.service.EmployeeDetailsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeDetailsController {
    private final EmployeeDetailsService employeeService;

    public EmployeeDetailsController(EmployeeDetailsService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/create")
    public String save(@RequestBody EmployeeDetailsDto employeeDetailsDto) {
        employeeService.saveData(employeeDetailsDto);
        return "1 row created";
    }
    @GetMapping("/employee/all")
    public List<EmployeeDetails> getAll() {
        return employeeService.getAllEmployee();
    }

    @PutMapping("/Update/{id}")
    public void update(@PathVariable Integer id, @RequestBody EmployeeDetailsDto employeeDetailsDto) {
        employeeService.updateData(id, employeeDetailsDto);
    }
    @DeleteMapping("/Delete/{id}")
    public String delete(@PathVariable Integer id) {
        return employeeService.deleteData(id);

    }
}
