package com.demo.AOP.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "dept001")
@Data
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
}
