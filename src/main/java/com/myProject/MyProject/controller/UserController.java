package com.myProject.MyProject.controller;

import com.myProject.MyProject.dto.UserDto;
import com.myProject.MyProject.entity.User;
import com.myProject.MyProject.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create")
    public String save (@RequestBody UserDto userDto){
        return  userService.saveData(userDto);
    }

    @GetMapping("/retrieve/all/data")
    public List<User> getAll(){
        return userService.getAllUser();
    }

    @PutMapping("/update/data/{id}")
    public String update(@PathVariable Integer id, @RequestBody UserDto userDto){
        return userService.updateData(id, userDto);
    }

    @DeleteMapping("/delete/data/{id}")
    public String deleteData(@PathVariable Integer id){
        return userService.deleteData(id);
    }

    @GetMapping("user/login/{email}/{password}")
    String login(@PathVariable String email, @PathVariable String password){
        return userService.login(email,password);
    }
}
