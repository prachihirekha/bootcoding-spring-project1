package com.coupon.application.util;

import java.util.Random;

public class GenerateDiscount {
    public static double discount(){
        String s []={"50% off", "Buy One, Get One (BOGO)","$10 off", "20% discount", "Free appetizer", "15% savings"};
        Random random =new Random();
        int dicounts = random.nextInt(s.length);
     return dicounts;
    }
}
