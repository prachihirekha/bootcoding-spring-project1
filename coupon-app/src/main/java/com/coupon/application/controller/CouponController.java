package com.coupon.application.controller;

import com.coupon.application.model.Coupon;
import com.coupon.application.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/coupon/") // Global Mapping
public class CouponController {
    @Autowired
    private CouponService couponService;

    // 1. Get All Coupons
//    @GetMapping("all-coupons")
//    public List<String> getAllCoupons(){
//        int quantity = 10;
//        return couponService.getNewCoupon(quantity);
//    }

    // 2. Get Coupon Details by Coupon Id using PathVariable
//    @GetMapping("coupon-id/{id}")
//    public String getCouponById(@PathVariable("id") String couponId){
//        return couponId + "-" + couponService.newCoupon();
//    }

    // 2.2 Get Coupon Details by Coupon Id using PathVariable

    // http://localhost:8082/app-name/coupon/getCoupon
    @PostMapping("/save_random_data/{value}")
    public List<Coupon> saveRandom(@PathVariable int value){
        return couponService.insertCoupon(value);
    }

}