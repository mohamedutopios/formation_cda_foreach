package com.example.demoFirst.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name ="addresses")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String street;
    private String city;
    private String zipcode;

    @OneToOne(mappedBy = "address")
    private Student student;




}
