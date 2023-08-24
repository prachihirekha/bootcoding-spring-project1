package com.coupon.application.service;


import com.coupon.application.helper.CouponHelper;
import com.coupon.application.model.Coupon;
import com.coupon.application.repository.CouponRepository;
import com.coupon.application.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@Service
public class CouponService {
   // private static final java.util.UUID UUID = ;
//    //Dependency inject
//    @Autowired
//    private CouponHelper couponHelper =null;
   @Autowired
  private CouponRepository couponRepository;
//
//    public String getNewCoupon(){
//        return couponHelper.newCoupon();
//    }
//    public List<String> getNewCoupon(int quantity){
//        List<String> coupons =new ArrayList<>();
//        for(int i=0;i< quantity;i++){
//            String newCoupon =couponHelper.newCoupon();
//            coupons.add(newCoupon);
//        }
//        return coupons;
//    }
//
//
//    public Coupon generateNewCoupon() {
//        Coupon coupon = Coupon.builder()
//                .id(UUID.randomUUID().toString())
//                .validFor(5 + new Random().nextInt(90))
//                .type("COUPON")
//                .build();
//        return coupon;
//    }
//
//    public String newCoupon() {
//            UUID uuid = UUID.randomUUID();
//            return uuid.toString();
//    }

//
    public List<Coupon> insertCoupon(int size){
        List<Coupon> list =new ArrayList<>();
        for (int i =0;i<size;i++){
            Coupon coupon=Coupon.builder().title(GenerateTitle.couponName()).category(GenerateCategory.category()).coupon_code(GenerateCouponCode.generateCode())
                    .category(GenerateCreateBy.createBy()).description(GenerateDescription.description()).discount(GenerateDiscount.discount())
                    .is_active(GenerateIsActive.isActive()).type(GenerateCouponType.couponType()).status(GenerateStatus.generateStatus())
                    .build();
            list.add(coupon);
        }
        return couponRepository.saveAll(list);
    }
}