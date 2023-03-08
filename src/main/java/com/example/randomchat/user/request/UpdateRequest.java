package com.example.randomchat.user.request;

import com.example.randomchat.user.User;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class UpdateRequest {

    @NotBlank
    private String password;

    @NotBlank
    private String name;

    public User toUser() {
        User user = new User();
        user.setPassword(password);
        user.setName(name);
        return user;
    }
}
