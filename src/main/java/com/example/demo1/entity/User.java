package com.example.demo1.entity;


import javax.persistence.*;
import java.util.List;

@Entity
public class User {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
    private int userId;

    private String name;

    private String email;

    private String address;

//    @OneToMany
//    @JoinColumn(columnDefinition = )
//    private List<Tweet> tweets;
}
