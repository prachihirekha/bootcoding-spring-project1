package com.patient.application.model;

import jakarta.persistence.*;
import lombok.Builder;


import lombok.Data;

import java.util.Date;

@Builder

@Data
@Entity
@Table(name="Patient_Table")
public class Patient {
    @Id
    @GeneratedValue
    private int srNo;
    @Column(name="address")
    private String city;
    @Column(name="first_Name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="disease")
    private String disease;
    @Column(name="mobile-No")
    private long phone;
    @Column(name="admitted_date")
    private Date date;
}
