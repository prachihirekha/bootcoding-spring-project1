package com.coupon.application.service;


import com.coupon.application.helper.CouponHelper;
import com.coupon.application.model.Coupon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@Component
public class CouponService {
   // private static final java.util.UUID UUID = ;
    //Dependency inject
    @Autowired
    private CouponHelper couponHelper =null;
    public String getNewCoupon(){
        return couponHelper.newCoupon();
    }
    public List<String> getNewCoupon(int quantity){
        List<String> coupons =new ArrayList<>();
        for(int i=0;i< quantity;i++){
            String newCoupon =couponHelper.newCoupon();
            coupons.add(newCoupon);
        }
        return coupons;
    }


    public Coupon generateNewCoupon() {
        Coupon coupon = Coupon.builder()
                .id(UUID.randomUUID().toString())
                .validFor(5 + new Random().nextInt(90))
                .type("COUPON")
                .build();
        return coupon;
    }

    public String newCoupon() {
            UUID uuid = UUID.randomUUID();
            return uuid.toString();
    }
}