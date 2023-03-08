package com.example.randomchat.user;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void insertUser(User user) {
//        User user = new User();
//        user.setIp(ip);
//        user.setToken(token);
//        user.setCreatedAt(LocalDateTime.now());
//        if (userRepository.findByToken(token) == null) {
//            return;
//        }
        userRepository.save(user);
    }

    public void updateUser(Long userId, User user) {

        User updateUser = userRepository.findById(userId).orElse(null);
        userRepository.save(updateUser);
    }
}
