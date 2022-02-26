package com.database.database.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "employee_details")
public class EmployeeDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "e_id")
    private Integer id;
    @Column(name = "e_name")
    private String name;
    @Column(name = "e_email")
    private String email;
    @Column(name ="e_salary")
    private Integer salary;
  /*****************************one to many mapping *********/
    @OneToMany(targetEntity = PhoneNo.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "e_id")
    private List<PhoneNo> phoneNoList = new ArrayList<>();


    public List<PhoneNo> getPhoneNoList() {
        return phoneNoList;
    }

    public void setStoryList(List<PhoneNo> phoneNoList) {
        this.phoneNoList = phoneNoList;

    }

    /**************************************************/


    public Integer getId() {
        return id;
    }

    public Integer getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setId(Integer id) {
        this.id = id;
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


}