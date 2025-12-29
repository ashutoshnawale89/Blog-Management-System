package org.bloggerManagementSystem.blogger.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.bloggerManagementSystem.blogger.entity.enums.userRole;

import java.sql.Timestamp;
import java.util.*;

@Entity
@Table(name = "users")
@Getter @Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userID")
    private Long userID;

    @OneToMany(mappedBy = "user")
    private List<Blog> blogs;

    @OneToMany(mappedBy = "user")
    private List<Comment> comments;

    @Column(name = "username")
    private String userName;

    @Setter(AccessLevel.PRIVATE)
    private String email;

    @Setter(AccessLevel.NONE)
    @Column(name = "password")
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private userRole role;

    @Column(name = "createdAt")
    private Timestamp createdAt;

    @Column(name = "updatedAt")
    private Timestamp updatedAt;

    public User(){

    }
public User(Long userID, String userName, String email, String password, userRole role, Timestamp createdAt, Timestamp updatedAt) {
        this.userID = userID;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.role = role;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }




}
