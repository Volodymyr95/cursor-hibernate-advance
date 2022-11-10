package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Car {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
}
