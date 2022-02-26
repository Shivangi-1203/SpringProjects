package com.database.database.service;

import com.database.database.entity.EmployeeDetails;
import com.database.database.repository.EmployeeDetailsRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeDetailsService {
        private final EmployeeDetailsRepo employeeDetailsRepo;

        public EmployeeDetailsService(EmployeeDetailsRepo employeeRepo){
            this.employeeDetailsRepo = employeeRepo;

        }

        public void saveData(EmployeeDetails employee ) {
           employeeDetailsRepo.save(employee);
        }

    public List<EmployeeDetails> getAllEmployee() {
            return employeeDetailsRepo.findAll();
    }

    public void updateData(Integer id, EmployeeDetails employeeDetails) {
    EmployeeDetails obj = (employeeDetailsRepo.findById(id).get());
        obj.setName(employeeDetails.getName());
        employeeDetailsRepo.save(obj);
    }

    public void deleteData(Integer id) {
        employeeDetailsRepo.deleteById(id);
    }
}

