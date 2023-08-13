package com.coupon.application.controller;

import com.coupon.application.service.Coupon;
import com.coupon.application.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/coupon")
public class CouponController {
    @Autowired
    private CouponService service;
    //http method get
    @GetMapping ("/getCoupon")
    public String newCoupon(){
        return "New Coupon :" +service.getNewCoupon();
    }
    @GetMapping("/getDummy")
    public Coupon getDummyJson(){
        return Coupon.builder()
        .id(service.getNewCoupon()).type("Vouchar")
                .validFor(3).build();
    }
    @GetMapping("/getMultipleCoupons")
    public List<String>getQuantity(){
        int qunatity =10;
        return service.getNewCoupon(qunatity);
    }


}
