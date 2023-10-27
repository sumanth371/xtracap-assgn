package com.example.xtracap.assgn.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity

@Table(name = "users")
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue
    private Long id;


    private String name;


    private String mobileNumber;


    private String email;


    private String fathersName;


    private String panNumber;

}

