package com.patient.application.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class InvoiceModePatient {
    private double bill;
    private  String disease;
    private String name;
    private Date date;
}
