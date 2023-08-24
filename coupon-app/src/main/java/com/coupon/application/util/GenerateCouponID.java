package com.coupon.application.util;

import java.util.Random;
import java.util.UUID;

public class GenerateCouponID {
    public static String randomId(){
       // Random random =new Random();
        // 10 letter alphanumeric-coupon
        String s= UUID.randomUUID().toString();
        return  s;

    }


}
