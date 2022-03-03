package com.myProject.MyProject.dto;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private Integer id;
    @NotNull
    private String name;
    @NotNull
    private String email;
    @NotNull
    private String phoneNumber;
    @NotNull
    private Integer age;
    @NotNull
    private String gender;
    @NotNull
    private String password;
}
