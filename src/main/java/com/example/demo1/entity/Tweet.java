package com.example.demo1.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tweet {

    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String tweet;
}
