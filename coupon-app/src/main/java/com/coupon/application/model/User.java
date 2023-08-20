package com.coupon.application.model;

import lombok.Builder;
import lombok.Data;
@Builder
@Data
public class User {
    private int id;
    private  String name;
    private long phone;
}
