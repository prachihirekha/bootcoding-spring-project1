package com.coupon.application.util;

import java.util.UUID;

public class GenerateCouponCode {
    public static String generateCode(){

        String ui = UUID.randomUUID().toString();
        return ui;
    }
}
