package com.database.database.service;

import com.database.database.dto.PhoneNoDto;
import com.database.database.entity.EmployeeDetails;
import com.database.database.entity.PhoneNo;
import com.database.database.repository.PhoneNoRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneNoService {
    private final PhoneNoRepo phoneNoRepo;

    public PhoneNoService(PhoneNoRepo phoneNoRepo) {
        this.phoneNoRepo = phoneNoRepo;
    }


    public  void saveData(PhoneNo phoneNo) {
        PhoneNo obj = new PhoneNo();
        obj.setPhoneNo(PhoneNoDto.getPhoneNo());
        obj.setCountryCode(PhoneNoDto.getCountryCode());

        phoneNoRepo.save(obj);
    }



    public List<PhoneNo> getAllPhoneNo() {
        return phoneNoRepo.findAll();
    }

    public void updateData(Integer id, PhoneNo phoneNo) {
        PhoneNo obj = (phoneNoRepo.findById(id).get());
        obj.setPhoneNo(phoneNo.getPhoneNo());
        phoneNoRepo.save(obj);
    }

    public void deleteData(Integer id, PhoneNo phoneNo) {
        PhoneNo obj = phoneNoRepo.findById(id).get();
        phoneNoRepo.delete(obj);
    }
}

