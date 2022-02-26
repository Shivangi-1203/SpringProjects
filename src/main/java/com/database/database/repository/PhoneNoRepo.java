package com.database.database.repository;

import com.database.database.entity.PhoneNo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneNoRepo extends JpaRepository<PhoneNo, Integer> {
}
