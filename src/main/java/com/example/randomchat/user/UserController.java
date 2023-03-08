package com.example.randomchat.user;

import com.example.randomchat.user.request.JoinRequest;
import com.example.randomchat.user.request.UpdateRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping("/{userId}")
    public void updateUser(@RequestBody @Validated UpdateRequest request, @PathVariable("userId") Long userId) {
        User user = request.toUser();

        userService.updateUser(userId, user);

    }
}
