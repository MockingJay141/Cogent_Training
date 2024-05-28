package com.demo.AOP.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "emp005")
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String Department;

}
