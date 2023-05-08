package com.example.gcpproject.message.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user_details")
@AllArgsConstructor
@NoArgsConstructor

public class User {

    private Integer id;
    private String name;
    private Integer age;
    private String address;

}
