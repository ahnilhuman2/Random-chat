package com.example.randomchat.user.request;

import com.example.randomchat.user.User;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class JoinRequest {
    @NotBlank
    private String token;

    public User toUser() {
        User user = new User();
        user.setToken(token);
        return user;
    }

    public void test(String t, String d) {

    }
}
