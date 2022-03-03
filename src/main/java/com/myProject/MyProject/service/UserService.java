package com.myProject.MyProject.service;

import com.myProject.MyProject.dto.UserDto;
import com.myProject.MyProject.entity.User;
import com.myProject.MyProject.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    String message;

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String saveData(UserDto userDto) {
        User obj = new User();
        obj.setId(userDto.getId());
        obj.setName(userDto.getName());
        obj.setEmail(userDto.getEmail());
        obj.setPhoneNumber(userDto.getPhone_number());
        obj.setAge(userDto.getAge());
        obj.setGender(userDto.getGender());
        obj.setPassword(userDto.getPassword());
        ;

        userRepository.save(obj);
        return "1 row created !!";
    }

    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    public String updateData(Integer id, UserDto userDto) {
        User obj = userRepository.findById(id).orElseThrow();
        obj.setName(userDto.getName());
        //obj.setEmail(userDto.getEmail());
        //obj.setPhoneNumber(userDto.getPhone_number());
        //obj.setAge(userDto.getAge());
        //obj.setGender(userDto.getGender());
        //obj.setPassword(userDto.getPassword());
        userRepository.save(obj);
        return "Data updated successfully !!";
    }

    public String deleteData(Integer id) {
        userRepository.deleteById(id);
        return "Data deleted successfully !!";
    }

    public String login(String email, String password) {
        User user = userRepository.findUser(email, password);

        if (user.getEmail().equals(email) && user.getPassword().equals(password) ) {
            message = "Successfully Login !!!!";
        } else {
            message = "You have entered wrong email or password !!";
        }
        return message;
    }
}
