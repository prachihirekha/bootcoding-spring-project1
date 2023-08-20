package com.patient.application.model;

import lombok.Builder;


import lombok.Data;

import java.util.Date;

@Builder

@Data
public class Patient {
    private int srNo;
    private String city;
    private String firstName;
    private String lastName;
    private String disease;
    private long phone;
    private Date date;
}
