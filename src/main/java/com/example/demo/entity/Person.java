package com.example.demo.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Person {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
}
