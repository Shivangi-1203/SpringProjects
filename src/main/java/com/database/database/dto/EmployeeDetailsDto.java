package com.database.database.dto;

import com.database.database.entity.PhoneNo;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDetailsDto {

    static String name;
    static String email;
    static Integer salary;
    private List<PhoneNo> phoneNoList = new ArrayList<>();

    public EmployeeDetailsDto(Integer id, String name, String email, Integer salary) {

        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public static String getName() {
        return name;
    }

    public static String getEmail() {
        return email;
    }

    public static Integer getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
    public List<PhoneNo> getPhoneNoList() {
        return phoneNoList;
    }

    public void setStoryList(List<PhoneNo> phoneNoList) {
        this.phoneNoList = phoneNoList;

    }
}
