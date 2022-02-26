package com.database.database.dto;

import com.database.database.entity.EmployeeDetails;

public class PhoneNoDto {
    private static String phoneNo;
    private static Integer countryCode;
    private EmployeeDetails employeedetails;

    public PhoneNoDto(Integer pid, String phoneNo, Integer countryCode) {

        this.phoneNo = phoneNo;
        this.countryCode = countryCode;
    }

    public static String getPhoneNo() {
        return phoneNo;
    }



    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public static Integer getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(Integer countryCode) {
        this.countryCode = countryCode;
    }
}
