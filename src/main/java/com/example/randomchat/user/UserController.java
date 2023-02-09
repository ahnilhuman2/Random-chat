package com.example.randomchat.user;

import com.example.randomchat.user.request.JoinRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/join")
    public void join(@RequestBody @Validated JoinRequest request, HttpServletRequest httpServletRequest) {
        String ip = httpServletRequest.getRemoteAddr();
//        User user = new User();
//        user.setToken(request.getToken());
        User user = request.toUser();
        user.setIp(ip);
        userService.insertUser(user);
    }

    @PostMapping("/heart_beat")
    public void heartBeat() {

    }
}
