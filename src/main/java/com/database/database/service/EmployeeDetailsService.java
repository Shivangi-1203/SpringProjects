package com.database.database.service;

import com.database.database.dto.EmployeeDetailsDto;
import com.database.database.entity.EmployeeDetails;
import com.database.database.repository.EmployeeDetailsRepo;
import org.springframework.jdbc.support.lob.TemporaryLobCreator;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeDetailsService {
    String msg;
    private final EmployeeDetailsRepo employeeDetailsRepo;

    public EmployeeDetailsService(EmployeeDetailsRepo employeeRepo) {
        this.employeeDetailsRepo = employeeRepo;

    }

    public void saveData(EmployeeDetailsDto employeeDetailsDto) {
        EmployeeDetails obj = new EmployeeDetails();
        obj.setName(employeeDetailsDto.getName());
        obj.setEmail(employeeDetailsDto.getEmail());
        obj.setSalary(employeeDetailsDto.getSalary());

        employeeDetailsRepo.save(obj);
    }

    public List<EmployeeDetails> getAllEmployee() {
        return employeeDetailsRepo.findAll();
    }

    public String updateData(Integer id, EmployeeDetailsDto employeeDetailsDto) {
        if (employeeDetailsRepo.existsById(id)) {
            EmployeeDetails obj = (employeeDetailsRepo.findById(id).get());
            obj.setName(employeeDetailsDto.getName());
            obj.setEmail(employeeDetailsDto.getEmail());
            employeeDetailsRepo.save(obj);
            msg = "Data successfully update !!!";
        } else {
            msg = "you have entered wrong id";
        }
        return msg;
    }

    public String deleteData(Integer id) {
        if (employeeDetailsRepo.existsById(id)) {
            employeeDetailsRepo.deleteById(id);
            msg = "Data deleted !!!";
        } else {
            msg = "Data not found";
        }
        return msg;
    }
}

