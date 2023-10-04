package com.coupon.application.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
@Builder
@Data
@Entity
@Table(name="coupon-user")
public class User {
    @Id
    @GeneratedValue
    private int id;
    @Column(name="u_name")
    private  String name;
    @Column(name ="mobile")
    private long phone;

}
