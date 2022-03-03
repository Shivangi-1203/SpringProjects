package com.myProject.MyProject.repository;

import com.myProject.MyProject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    @Query("SELECT u FROM User u WHERE u.email=:email AND u.password=:password" )
    public User findUser(@Param("email") String email, @Param("password") String password);

}
