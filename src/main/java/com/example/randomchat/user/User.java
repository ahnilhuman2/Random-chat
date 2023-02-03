package com.example.randomchat.user;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "token")
    private String token;

    @Column(name = "ip")
    private String ip;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "upadated_at")
    private LocalDateTime updatedAt;
}
