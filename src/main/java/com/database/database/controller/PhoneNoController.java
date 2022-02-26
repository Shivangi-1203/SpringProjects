package com.database.database.controller;


import com.database.database.entity.EmployeeDetails;
import com.database.database.entity.PhoneNo;
import com.database.database.service.PhoneNoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PhoneNoController {
    private final PhoneNoService phoneNoService;

    public PhoneNoController(PhoneNoService phoneNoService) {
        this.phoneNoService = phoneNoService;
    }

    @PostMapping("/save/phoneNo")
    public String save(@RequestBody PhoneNo phoneNo) {
        phoneNoService.saveData(phoneNo);
        return "1 row created";
    }

    @GetMapping("/phoneNo/All")
    public List<PhoneNo> getAll() {
        return phoneNoService.getAllPhoneNo();
    }

    @PutMapping("/Update/phoneNO/{pid}")
    public void update(@PathVariable Integer pid, @RequestBody PhoneNo phoneNo) {
        phoneNoService.updateData(pid, phoneNo);
    }
    @DeleteMapping("/Delete/phoneNo/{pid}")
    public String delete(@PathVariable Integer id, @RequestBody PhoneNo phoneNo) {
        phoneNoService.deleteData(id,   phoneNo);
        return "Id " + id + " successfully Deleted.";
    }
}
