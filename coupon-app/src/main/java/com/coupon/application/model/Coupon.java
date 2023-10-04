package com.coupon.application.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
@Entity
@Table(name="coupon_application")
public class Coupon {
    @Id
    @GeneratedValue
    private int id;
    @Column(name ="coupon_Type")
    private String type;
    @Column(name ="valid_day")
    private String validFor;
    @Column(name="title")
    private String title;
    private String coupon_code;
    private  String description;
    private String category;

    private double discount;
    private Date create_date;

    private  String create_by;

    private boolean is_active;
    private String status;



}
